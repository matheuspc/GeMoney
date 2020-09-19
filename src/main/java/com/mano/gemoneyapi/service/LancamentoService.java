package com.mano.gemoneyapi.service;

import com.mano.gemoneyapi.model.Lancamento;
import com.mano.gemoneyapi.model.Pessoa;
import com.mano.gemoneyapi.repository.LancamentoRepository;
import com.mano.gemoneyapi.repository.PessoaRepository;
import com.mano.gemoneyapi.service.exception.PessoaInexistenteOuInativaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LancamentoService {

    @Autowired
    private LancamentoRepository lancamentoRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    public Lancamento salvar(Lancamento lancamento) {
        Optional<Pessoa> pessoa = pessoaRepository.findById(lancamento.getPessoa().getCodigo());
        if(!pessoa.isPresent() || pessoa.get().isInativo()){
            throw new PessoaInexistenteOuInativaException();
        }
        return lancamentoRepository.save(lancamento);
    }
}

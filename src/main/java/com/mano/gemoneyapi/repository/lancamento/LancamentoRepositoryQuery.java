package com.mano.gemoneyapi.repository.lancamento;

import com.mano.gemoneyapi.model.Lancamento;
import com.mano.gemoneyapi.repository.filter.LancamentoFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LancamentoRepositoryQuery {

    public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);

}

package com.mano.gemoneyapi.repository;

import com.mano.gemoneyapi.model.Lancamento;
import com.mano.gemoneyapi.repository.lancamento.LancamentoRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {
}

package com.mano.gemoneyapi.repository;

import com.mano.gemoneyapi.model.Categoria;
import com.mano.gemoneyapi.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}

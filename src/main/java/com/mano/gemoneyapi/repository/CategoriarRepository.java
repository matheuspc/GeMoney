package com.mano.gemoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mano.gemoneyapi.model.Categoria;

public interface CategoriarRepository extends JpaRepository<Categoria, Long> {
	
	

}

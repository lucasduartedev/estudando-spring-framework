package com.spring.estudando.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.estudando.models.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
	
	List<Pessoa> findByNomeContains(String name);
	
	List<Pessoa> findByDataNasc(String data_nasc);
	
	@Query("SELECT p FROM pessoas p WHERE p.dataNasc BETWEEN ?1 AND ?2")
	List<Pessoa> findByBetweenBirthday(String data1, String data2);
	
	
}

package com.exercise.multicert.dao;

import com.exercise.multicert.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    @Query("SELECT p FROM Pessoa p WHERE p.nome LIKE %?1%")
    List<Pessoa> findByNome(String nome);


    @Query("SELECT p FROM Pessoa p WHERE p.nif = ?1")
    Optional<Pessoa> findByNif(long nif);

}

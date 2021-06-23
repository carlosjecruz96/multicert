package com.exercise.multicert.service;

import com.exercise.multicert.dao.PessoaRepository;
import com.exercise.multicert.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    private PessoaRepository pessoaRepository;


    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }

    public void save(Pessoa pessoa) {
        pessoaRepository.save(pessoa);

    }

    public Pessoa findById(long id) {
        Optional<Pessoa> result = pessoaRepository.findById(id);

        return result.orElse(null);
    }

    public void deleteById(long theId) {
        pessoaRepository.deleteById(theId);
    }

    public Pessoa findByNif(long nif) {
        Optional<Pessoa> result = pessoaRepository.findByNif(nif);

        return result.orElse(null);
    }

    public List<Pessoa> findByNome(String nome) {

        return pessoaRepository.findByNome(nome);
    }


}


package com.exercise.multicert.controller;

import com.exercise.multicert.model.Pessoa;
import com.exercise.multicert.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;


    // endpoint para listar clientes
    @GetMapping("/pessoas")
    public List<Pessoa> findAll() {

        return pessoaService.findAll();
    }

    // endpoint para adicionar clientes
    @PostMapping("/pessoas")
    public Pessoa addPessoa(@RequestBody Pessoa pessoa) {

        pessoa.setId(0);

        pessoaService.save(pessoa);

        return pessoa;

    }

    // endpoint para apagar clientes
    @DeleteMapping("/pessoas")
    public String deletePessoa(@RequestParam("id") long id) {

        Pessoa pessoa = pessoaService.findById(id);

        if (pessoa == null) {
            throw new RuntimeException("Employee id not found - " + id);
        }

        pessoaService.deleteById(id);

        return "Deleted pessoa id - " + id;

    }

    // endpoint para obter cliente a partir do nif clientes
    @GetMapping("/pessoas/nif")
    public Pessoa findByNif(@RequestParam("nif")  long nif) {

        Pessoa pessoa = pessoaService.findByNif(nif);

        if (pessoa == null) {
            throw new RuntimeException("pessoa nif not found - " + nif);
        }
        return pessoa;
    }

    // endpoint para  obter clientes com um determinado nome
    @GetMapping("/pessoas/nome")
    public List<Pessoa> findByNome(@RequestParam("nome") String nome) {

        return pessoaService.findByNome(nome);
    }



}


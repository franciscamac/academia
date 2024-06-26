package br.com.fran.academia.controller;


import br.com.fran.academia.entity.Aluno;
import br.com.fran.academia.entity.AvaliacaoFisica;
import br.com.fran.academia.entity.form.AlunoForm;
import br.com.fran.academia.service.impl.AlunoServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @GetMapping
    public List<Aluno> getAll(){
        return service.getAll();
    }

    @PostMapping
    public Aluno create( @Valid @RequestBody AlunoForm form){
        return service.create(form);
    }
    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id){
        return service.getAllAvaliacaoFisicaId(id);
    }
}

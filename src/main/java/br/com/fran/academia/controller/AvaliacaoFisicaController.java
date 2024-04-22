package br.com.fran.academia.controller;

import br.com.fran.academia.entity.AvaliacaoFisica;
import br.com.fran.academia.service.impl.AvalicaoFisicaServiceimpl;
import br.com.fran.academia.entity.form.AvaliacaoFisicaForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvalicaoFisicaServiceimpl service;

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form){
        return service.create(form);
    }
}

package br.com.fran.academia.controller;
import br.com.fran.academia.entity.Matricula;
import br.com.fran.academia.entity.form.MatriculaForm;
import br.com.fran.academia.service.impl.MatriculaServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {
    @Autowired
    private MatriculaServiceImpl service;

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm form){
        return service.create(form);
    }

    @GetMapping
    public List<Matricula> getAll(){
        return  service.getAll();
    }
}

package br.com.fran.academia.service.impl;

import br.com.fran.academia.entity.Aluno;
import br.com.fran.academia.entity.AvaliacaoFisica;
import br.com.fran.academia.entity.form.AlunoForm;
import br.com.fran.academia.entity.form.AlunoUpdateForm;
import br.com.fran.academia.repository.AlunoRepository;
import br.com.fran.academia.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {

    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());

        return repository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll() {
       return repository.findAll();
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
       Aluno aluno = repository.findById(id).get();
        return aluno.getAvaliacoes();
    }

}

package br.com.fran.academia.service.impl;

import br.com.fran.academia.entity.Aluno;
import br.com.fran.academia.entity.Matricula;
import br.com.fran.academia.entity.form.MatriculaForm;
import br.com.fran.academia.repository.AlunoRepository;
import br.com.fran.academia.repository.MatriculaRepository;
import br.com.fran.academia.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MatriculaServiceImpl implements IMatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaForm form) {
        Matricula matricula = new Matricula();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
        matricula.setAluno(aluno);

        return matriculaRepository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return null;
    }

    @Override
    public List<Matricula> getAll() {
        return List.of();
    }

    @Override
    public void delete(Long id) {

    }
}

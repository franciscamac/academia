package br.com.fran.academia.service.impl;

import br.com.fran.academia.entity.Aluno;
import br.com.fran.academia.entity.AvaliacaoFisica;
import br.com.fran.academia.entity.form.AvaliacaoFisicaForm;
import br.com.fran.academia.entity.form.AvaliacaoFisicaUpdateForm;
import br.com.fran.academia.repository.AlunoRepository;
import br.com.fran.academia.repository.AvaliacaoFisicaRepository;
import br.com.fran.academia.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvalicaoFisicaServiceimpl implements IAvaliacaoFisicaService {
    @Autowired
    private AvaliacaoFisicaRepository avaliacaoRepository;

    @Autowired
    private AlunoRepository alunoRepository;


    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());

        return avaliacaoRepository.save(avaliacaoFisica);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return List.of();
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}

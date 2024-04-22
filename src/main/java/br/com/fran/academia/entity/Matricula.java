package br.com.fran.academia.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;


@Entity
@Table(name = "tb_matriculas")
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    private LocalDateTime dataDaMatricula = LocalDateTime.now();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public LocalDateTime getDataDaMatricula() {
        return dataDaMatricula;
    }

    public void setDataDaMatricula(LocalDateTime dataDaMatricula) {
        this.dataDaMatricula = dataDaMatricula;
    }

    public Matricula(Long id, Aluno aluno, LocalDateTime dataDaMatricula) {
        this.id = id;
        this.aluno = aluno;
        this.dataDaMatricula = dataDaMatricula;
    }

    public Matricula() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matricula matricula = (Matricula) o;
        return Objects.equals(id, matricula.id) && Objects.equals(aluno, matricula.aluno) && Objects.equals(dataDaMatricula, matricula.dataDaMatricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, aluno, dataDaMatricula);
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "id=" + id +
                ", aluno=" + aluno +
                ", dataDaMatricula=" + dataDaMatricula +
                '}';
    }

}

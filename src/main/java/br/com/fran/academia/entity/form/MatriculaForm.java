package br.com.fran.academia.entity.form;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.util.Objects;

public class MatriculaForm {

    @NotNull(message = "Preencha o campo corretamente.")
    @Positive(message = "O Id do aluno precisa ser positivo.")
    private Long alunoId;

    public Long getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Long alunoId) {
        this.alunoId = alunoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatriculaForm that = (MatriculaForm) o;
        return Objects.equals(alunoId, that.alunoId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(alunoId);
    }

    @Override
    public String toString() {
        return "MatriculaForm{" +
                "alunoId=" + alunoId +
                '}';
    }

    public MatriculaForm(Long alunoId) {
        this.alunoId = alunoId;
    }

    public MatriculaForm() {
    }
}

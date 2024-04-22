package br.com.fran.academia.entity.form;


import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.util.Objects;


public class AvaliacaoFisicaForm {
    @Positive(message = "O Id do aluno precisa ser positivo.")
    private Long alunoId;

    @NotNull(message = "Preencha o campo corretamente.")
    @Positive(message = "${validatedValue}' precisa ser positivo.")
    private double peso;

    @NotNull(message = "Preencha o campo corretamente.")
    @Positive(message = "${validatedValue}' precisa ser positivo.")
    @DecimalMin(value = "150", message = "'${validatedValue}' precisa ser no mínimo {value}.")
    private double altura;

    public Long getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Long alunoId) {
        this.alunoId = alunoId;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AvaliacaoFisicaForm that = (AvaliacaoFisicaForm) o;
        return Double.compare(peso, that.peso) == 0 && Double.compare(altura, that.altura) == 0 && Objects.equals(alunoId, that.alunoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alunoId, peso, altura);
    }

    @Override
    public String toString() {
        return "AvaliacaoFisicaForm{" +
                "alunoId=" + alunoId +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}

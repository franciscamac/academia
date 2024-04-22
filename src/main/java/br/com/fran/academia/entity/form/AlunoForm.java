package br.com.fran.academia.entity.form;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.util.Objects;

public class AlunoForm {

    @NotBlank(message = "Preencha o campo corretamente.")
    @Size(min=3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres. ")
    private String nome;

    @NotBlank(message = "Preencha o campo corretamente.")
    @CPF(message = "'${validatedValue}' é inválido!")
    private String cpf;

    @NotBlank(message = "Preencha o campo corretamente.")
    @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String bairro;

    @NotNull(message = "Prencha o campo corretamente.")
    @Past(message = "Data '${validatedValue}' é inválida.")
    private LocalDate dataDeNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public AlunoForm(String nome, String cpf, String bairro, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.bairro = bairro;
        this.dataDeNascimento = dataDeNascimento;
    }

    public AlunoForm() {
    }

    @Override
    public String toString() {
        return "AlunoForm{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", bairro='" + bairro + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlunoForm alunoForm = (AlunoForm) o;
        return Objects.equals(nome, alunoForm.nome) && Objects.equals(cpf, alunoForm.cpf) && Objects.equals(bairro, alunoForm.bairro) && Objects.equals(dataDeNascimento, alunoForm.dataDeNascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, bairro, dataDeNascimento);
    }
}

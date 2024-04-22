package br.com.fran.academia.entity;

import jakarta.persistence.*;


import java.time.LocalDateTime;
import java.util.Objects;


@Entity
@Table(name = "tb_avaliacoes")
public class AvaliacaoFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    private LocalDateTime dataDaAvaliacao = LocalDateTime.now();

    @Column(name = "peso_atual")
    private double peso;

    @Column(name = "altura_atual")
    private double altura;

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

    public LocalDateTime getDataDaAvaliacao() {
        return dataDaAvaliacao;
    }

    public void setDataDaAvaliacao(LocalDateTime dataDaAvaliacao) {
        this.dataDaAvaliacao = dataDaAvaliacao;
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

    public AvaliacaoFisica(Long id, Aluno aluno, LocalDateTime dataDaAvaliacao, double peso, double altura) {
        this.id = id;
        this.aluno = aluno;
        this.dataDaAvaliacao = dataDaAvaliacao;
        this.peso = peso;
        this.altura = altura;
    }

    public AvaliacaoFisica() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AvaliacaoFisica that = (AvaliacaoFisica) o;
        return Double.compare(peso, that.peso) == 0 && Double.compare(altura, that.altura) == 0 && Objects.equals(id, that.id) && Objects.equals(aluno, that.aluno) && Objects.equals(dataDaAvaliacao, that.dataDaAvaliacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, aluno, dataDaAvaliacao, peso, altura);
    }

    @Override
    public String toString() {
        return "AvaliacaoFisica{" +
                "id=" + id +
                ", aluno=" + aluno +
                ", dataDaAvaliacao=" + dataDaAvaliacao +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}

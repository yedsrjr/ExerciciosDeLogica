package Exercicios.entities;

public abstract class Funcionarios {
    private String nome;
    private Integer horas;
    private Double valorHoras;

    public Funcionarios(String nome, Integer horas, Double valorHoras) {
        this.nome = nome;
        this.horas = horas;
        this.valorHoras = valorHoras;
    }

    public String getNome() {
        return nome;
    }

    public Integer getHoras() {
        return horas;
    }

    public Double getValorHoras() {
        return valorHoras;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public void setValorHoras(Double valorHoras) {
        this.valorHoras = valorHoras;
    }
}

package Exercicios.entities;

public class FuncionarioTerceirizado extends Funcionarios{
    private double despesaAdicional;

    public FuncionarioTerceirizado(String nome, Integer horas, Double valorHoras, double despesaAdicional) {
        super(nome, horas, valorHoras);
        this.despesaAdicional = despesaAdicional;
    }
}

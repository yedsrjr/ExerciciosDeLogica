package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("iMac", 12.449);
        Tomate tomate = new Tomate("Tomate vermelhinho", 4.54);
        Televisao tv = new Televisao("Smart TCL 60\" ",4000);
        CalculadoraImposto.calculaImposto(computador);
        System.out.println("-------------------------");
        tomate.setDataValidade("20/06/2023");
        CalculadoraImposto.calculaImposto(tomate);
        CalculadoraImposto.calculaImposto(tv);
    }
}

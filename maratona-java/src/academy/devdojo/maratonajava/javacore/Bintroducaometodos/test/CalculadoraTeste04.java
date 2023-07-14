package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
         int num1 = 1;
         int num2 = 2;
        Calculadora calc = new Calculadora();
        calc.alteraDoisNumeros(1, 2);
        System.out.println("Dentro da CalculadoraTeste04");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}

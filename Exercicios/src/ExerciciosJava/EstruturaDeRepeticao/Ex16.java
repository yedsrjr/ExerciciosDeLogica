package ExerciciosJava.EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        int novoTermo = 0;

        System.out.println("Série de Fibonacci até que o valor seja maior que 500:");
        System.out.print(n1 + " " + n2 + " ");

        while (novoTermo <= 500) {
            novoTermo = n1 + n2;
            if (novoTermo <= 500) {
                System.out.print(novoTermo + " ");
            }
            n1 = n2;
            n2 = novoTermo;
        }
    }
}

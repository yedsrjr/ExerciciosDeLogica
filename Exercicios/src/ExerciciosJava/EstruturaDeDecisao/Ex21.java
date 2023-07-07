package ExerciciosJava.EstruturaDeDecisao;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorSaque;

        System.out.print("Digite o valor do saque (entre 10 e 600 reais): ");
        valorSaque = sc.nextInt();

        if (valorSaque < 10 || valorSaque > 600) {
            System.out.println("Valor inválido. O valor do saque deve estar entre 10 e 600 reais.");
            return;
        }

        int notas100 = valorSaque / 100;
        int resto = valorSaque % 100;

        int notas50 = resto / 50;
        resto %= 50;

        int notas10 = resto / 10;
        resto %= 10;

        int notas5 = resto / 5;
        resto %= 5;

        int notas1 = resto;

        System.out.println("Notas fornecidas:");
        if (notas100 > 0) {
            System.out.println(notas100 + " notas de 100");
        }
        if (notas50 > 0) {
            System.out.println(notas50 + " notas de 50");
        }
        if (notas10 > 0) {
            System.out.println(notas10 + " notas de 10");
        }
        if (notas5 > 0) {
            System.out.println(notas5 + " notas de 5");
        }
        if (notas1 > 0) {
            System.out.println(notas1 + " notas de 1");
        }
        sc.close();
    }
}


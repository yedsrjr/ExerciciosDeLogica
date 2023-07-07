package ExerciciosJava.EstruturaDeDecisao;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para descobrir se ele é par ou ímpar: ");
        int numero = sc.nextInt();

        if (numero % 2 != 0) {
            System.out.println(numero + " é ímpar.");
        } else {
            System.out.println(numero + " é par.");
        }
        sc.close();
    }
}

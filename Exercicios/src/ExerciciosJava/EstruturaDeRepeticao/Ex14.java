package ExerciciosJava.EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(">>> ");
            numeros[i] = sc.nextInt();
        }
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                System.out.print(numero + " ");
            }
        }
        sc.close();
    }
}
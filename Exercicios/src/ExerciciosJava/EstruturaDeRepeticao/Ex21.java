package ExerciciosJava.EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo ou -1 para sair.");
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + " não é um número primo");
        } else {
            boolean ehprimo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    ehprimo = false;
                    break;
                }
            }
            if (ehprimo) {
                System.out.println("O número " + num + " é primo.");
            } else {
                System.out.println("O número " + num + " não é primo.");
            }
        }
    }
}

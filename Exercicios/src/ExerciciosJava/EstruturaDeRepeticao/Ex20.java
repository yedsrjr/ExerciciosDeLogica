package ExerciciosJava.EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao calculador de fatorial!");
        System.out.println("Digite um número inteiro positivo (menor que 16) ou -1 para sair.");

        int num;
        while (true) {
            System.out.print("Digite um número: ");
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();

                if (num == -1) {
                    System.out.println("Encerrando o programa. Obrigado!");
                    break;
                }

                if (num < 0 || num >= 16) {
                    System.out.println("Por favor, digite um número inteiro positivo menor que 16.");
                } else {
                    int resultado = 1;
                    for (int i = 1; i <= num; i++) {
                        resultado *= i;
                    }
                    System.out.println(num + "! = " + resultado);
                }
            } else {
                System.out.println("Por favor, digite um número inteiro válido.");
                scanner.next();
            }
        }
        scanner.close();
    }
}




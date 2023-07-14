package academy.devdojo.lacosderepeticao;

import java.util.Scanner;

public class Aula05DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int desejaContinuar = 1;
        do {
            System.out.print("Player 1: Digite um número de 1 a 10: ");
            int player1 = sc.nextInt();
            System.out.print("Player 2: Digite um número de 1 a 10: ");
            int player2 = sc.nextInt();
            System.out.println("Acertou! " + (player1 == player2));
            System.out.println("--------------------------------------");
            System.out.println("Deseja continuar jogando? ");
            System.out.println("1. Sim");
            System.out.println("2. Não");
            desejaContinuar = sc.nextInt();
        } while (desejaContinuar == 1);
    }
}


package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class Aula03ExercicioArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrays1 = new int[3];
        int[] arrays2 = new int[3];
        int[] arrays3 = new int[3];

        for (int i = 0; i < arrays1.length; i++){
            System.out.println("Vetor 1, Posição 0");
            arrays1[i] = sc.nextInt();
        }
        for (int i = 0; i < arrays2.length; i++){
            System.out.println("Vetor 2, Posição 0");
            arrays2[i] = sc.nextInt();
        }
        System.out.print("Resultado da Multiplicação: ");
        for (int i = 0; i < arrays3.length; i++){
            arrays3[i] = arrays1[i] * arrays2[i];
            System.out.print(arrays3[i] + " ");
        }
    }
}

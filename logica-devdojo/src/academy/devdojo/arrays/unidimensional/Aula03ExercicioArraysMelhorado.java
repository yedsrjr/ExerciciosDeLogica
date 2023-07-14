package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class Aula03ExercicioArraysMelhorado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrays1 = new int[3];
        int[] arrays2 = new int[3];
        int[] arrays3 = new int[3];
        String multiplicacao_arrays = "";

        for (int i = 0; i < arrays1.length; i++) {
            System.out.println("Vetor 1, Posição " + i);
            arrays1[i] = sc.nextInt();
            System.out.println("Vetor 2, Posição " + i);
            arrays2[i] = sc.nextInt();
            arrays3[i] = arrays1[i] * arrays2[i];
            multiplicacao_arrays = multiplicacao_arrays + arrays3[i] + " ";
        }
        System.out.print("Resultado da Multiplicação: " + multiplicacao_arrays);
    }
}


package academy.devdojo.arrays.multidimensionais;

import java.util.Scanner;

public class Aula02InicializandoArraysMultidimensionais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arrayMulti1 = new int[2][3];

        for (int i = 0; i < arrayMulti1.length; i++) {
            for (int j = 0; j < arrayMulti1[i].length; j++) {
                System.out.println("Digite o valor da posição [" + i + "][" + j + "]");
                arrayMulti1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arrayMulti1.length; i++) {
            for (int j = 0; j < arrayMulti1[i].length; j++) {
                System.out.println("[" + i + "][" + j + "] = " + arrayMulti1[i][j]);

            }
        }
    }
}
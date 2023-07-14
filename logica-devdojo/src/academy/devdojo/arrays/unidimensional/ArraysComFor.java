package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class ArraysComFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[4];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota: " + (i+1));
            notas[i] = sc.nextDouble();
        }
    }
}
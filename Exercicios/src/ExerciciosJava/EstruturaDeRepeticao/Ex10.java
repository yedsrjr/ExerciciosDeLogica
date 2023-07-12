package ExerciciosJava.EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[2];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = sc.nextInt();
        }
        System.out.println("O Intervalo dos números: ");
        for (int i = numeros[1] + 1; i < numeros[0]; i++){
            System.out.print(i + " ");
        }
        sc.close();
    }
}

package ExerciciosJava.EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
        }

        int maior = numeros[0];
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > maior){
                maior = numeros[i];
            }
        }
        System.out.println("O número maior é: " + maior);
        sc.close();
    }
}

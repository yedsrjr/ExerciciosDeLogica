package ExerciciosJava.EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }
        double media = (double) soma / numeros.length;
        System.out.println("Soma: "+ soma);
        System.out.println("Média: "+ media);

        sc.close();
    }
}

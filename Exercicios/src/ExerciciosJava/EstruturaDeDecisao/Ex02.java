package ExerciciosJava.EstruturaDeDecisao;

import java.util.Scanner;

public class Ex02 {
    // Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println(num + " é positivo");
        } else {
            System.out.println(num + " é negativo");
        }
        sc.close();
    }
}

package ExerciciosJava.EstruturaDeDecisao;

import java.util.Scanner;

public class Ex07 {
    //Faça um Programa que leia três números e mostre o maior e o menor deles.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        if(num1 < num2 && num1 < num3){
            System.out.println(num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println(num2);
        } else if (num3 < num1 && num3 < num2) {
            System.out.println(num3);
        }
    }
}

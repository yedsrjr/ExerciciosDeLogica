package ExerciciosJava.EstruturaDeDecisao;

import java.util.Scanner;

public class Ex06 {
    //Faça um Programa que leia três números e mostre o maior deles.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = sc.nextInt();
        System.out.print("Digite um último número: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
        sc.close();
    }
}

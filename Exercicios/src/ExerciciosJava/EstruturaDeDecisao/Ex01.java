package ExerciciosJava.EstruturaDeDecisao;

import java.util.Scanner;

public class Ex01 {
    //  Faça um Programa que peça dois números e imprima o maior deles.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("O número maior é " + num1);
        } else if (num2 > num1){
            System.out.println("O número maior é " + num2);
        } else {
            System.out.println("Os números são iguais");
        }
        sc.close();
    }
}

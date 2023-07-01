package ExerciciosJava.EstruturaDeDecisao;

import java.util.Scanner;

public class Ex09 {
    //Faça um Programa que leia três números e mostre-os em ordem decrescente.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o 2º número: ");
        int n2 = sc.nextInt();
        System.out.print("Digite o 3º número: ");
        int n3 = sc.nextInt();

        if(n1 > n2 && n3 <n2 && n1>n3){
            System.out.printf("{%d , %d, %d}", n1,n2,n3);
        } else if (n1 > n2 && n3 >n2) {
            System.out.printf("{%d , %d, %d}", n1,n3,n2);
        }else if (n2 > n1 && n1 <n3 && n2 > n3) {
            System.out.printf("{%d , %d, %d}", n2,n3,n1);
        }else if (n2 > n1 && n1 >n3) {
            System.out.printf("{%d , %d, %d}", n2,n1,n3);
        }else if (n3 > n1 && n3 <n2 && n3 >n2) {
            System.out.printf("{%d , %d, %d}", n3,n2,n1);
        }else if (n3 > n1 && n1 >n2) {
            System.out.printf("{%d , %d, %d}", n3,n1,n2);
        }
        sc.close();
    }
}


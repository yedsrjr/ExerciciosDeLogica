package ExerciciosJava.EstruturaDeDecisao;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor da primeira nota:  ");
        double n1 = sc.nextDouble();
        System.out.print("Digite o valor da segunda nota:  ");
        double n2 = sc.nextDouble();
        double media = (n1+n2)/2;

        if(media >= 9 && media >= 10){
            System.out.printf(" Média: %.1f%n ", media);
            System.out.println("Nota: A");
            System.out.println(" Aprovado");
        } else if (media >= 7.5 && media < 9) {
            System.out.printf(" Média: %.1f%n ", media);
            System.out.println("Nota: B");
            System.out.println(" Aprovado");
        } else if (media >= 6 && media < 7.5) {
            System.out.printf(" Média: %.1f%n ", media);
            System.out.println("Nota: C");
            System.out.println(" Aprovado");
        } else if (media >= 4 && media < 6) {
            System.out.printf(" Média: %.1f%n ", media);
            System.out.println("Nota: D");
            System.out.println(" Reprovado");
        } else {
            System.out.printf(" Média: %.1f%n ", media);
            System.out.println("Nota: E");
            System.out.println(" Reprovado");
        }
        sc.close();
    }
}

package ExerciciosJava.EstruturaDeDecisao;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor para saber se ele é inteiro ou decimal: ");
        double n = sc.nextDouble();
        if (n == Math.round(n)) {
            System.out.println("O número é inteiro.");
        } else {
            System.out.println("O número é decimal.");
        }
        sc.close();
    }
}

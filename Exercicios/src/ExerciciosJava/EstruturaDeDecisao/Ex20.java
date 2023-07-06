package ExerciciosJava.EstruturaDeDecisao;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, media;

        System.out.print("Digite a primeira nota: ");
        n1 = sc.nextInt();
        System.out.print("Digite a segunda nota: ");
        n2 = sc.nextInt();
        System.out.print("Digite a terceira nota: ");
        n3 = sc.nextInt();
        media = (n1 + n2 + n3) / 3;

        if (media >= 10) {
            System.out.println("Média = 10,0 Aprovado com Distinção");
        } else if (media >= 7) {
            System.out.printf("Média = %.2f Aprovado", media);
        } else {
            System.out.printf("Média = %.2f Reprovado", media);
        }
        sc.close();
    }
}

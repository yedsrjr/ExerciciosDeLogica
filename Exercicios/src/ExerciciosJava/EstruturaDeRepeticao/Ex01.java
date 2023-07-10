package ExerciciosJava.EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma nota entre 0 e 10: ");
        int nota = sc.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Valor inválido, digite novamente!");
            nota = sc.nextInt();
        }
        System.out.println("Valor válido.");
        sc.close();
    }
}

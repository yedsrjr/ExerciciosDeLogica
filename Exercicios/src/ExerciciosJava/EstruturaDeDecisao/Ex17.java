package ExerciciosJava.EstruturaDeDecisao;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ano;
        System.out.print("Digite um ano para descobrir se ele é bissexto: ");
        ano = sc.nextInt();

        if(ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)){
            System.out.println(ano + " é bissexto.");
        }else {
            System.out.println(ano + " não é um ano bissexto.");
        }
        sc.close();
    }
}

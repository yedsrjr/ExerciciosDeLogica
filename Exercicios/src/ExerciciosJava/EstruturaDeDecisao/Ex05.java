package ExerciciosJava.EstruturaDeDecisao;

import java.util.Scanner;

public class Ex05 {
    /*Faça um programa para a leitura de duas notas parciais de um aluno.
    O programa deve calcular a média alcançada por aluno e apresentar:
    A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
    A mensagem "Reprovado", se a média for menor do que sete;
    A mensagem "Aprovado com Distinção", se a média for igual a dez.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();
        double media = (n1 + n2)/2;

        if(media >= 10){
            media = 10;
            System.out.printf("Média: %.2f. Aprovado com distinção.", media);
        } else if (media >= 7) {
            System.out.printf("Média: %.2f. Aprovado.");
        } else {
            System.out.printf("Média: %.2f Reprovado.", media);
        }
        sc.close();
    }
}


package ExerciciosJava.EstruturaDeDecisao;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Responda 'Sim' ou 'Não' para as seguintes perguntas sobre o crime:");

        System.out.print("Telefonou para a vítima? ");
        String resposta1 = scanner.nextLine().toLowerCase();

        System.out.print("Esteve no local do crime? ");
        String resposta2 = scanner.nextLine().toLowerCase();

        System.out.print("Mora perto da vítima? ");
        String resposta3 = scanner.nextLine().toLowerCase();

        System.out.print("Devia para a vítima? ");
        String resposta4 = scanner.nextLine().toLowerCase();

        System.out.print("Já trabalhou com a vítima? ");
        String resposta5 = scanner.nextLine().toLowerCase();

        int respostas_positivas = 0;

        if (resposta1.equals("sim")) {
            respostas_positivas++;
        }
        if (resposta2.equals("sim")) {
            respostas_positivas++;
        }
        if (resposta3.equals("sim")) {
            respostas_positivas++;
        }
        if (resposta4.equals("sim")) {
            respostas_positivas++;
        }
        if (resposta5.equals("sim")) {
            respostas_positivas++;
        }
        if (respostas_positivas == 5) {
            System.out.println("Classificação: Assassino(a)");
        } else if (respostas_positivas >= 3) {
            System.out.println("Classificação: Cúmplice");
        } else if (respostas_positivas == 2) {
            System.out.println("Classificação: Suspeito(a)");
        } else {
            System.out.println("Classificação: Inocente");
        }
        scanner.close();
    }
}

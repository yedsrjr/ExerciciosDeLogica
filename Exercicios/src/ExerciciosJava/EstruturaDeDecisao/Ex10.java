package ExerciciosJava.EstruturaDeDecisao;

import java.util.Scanner;

public class Ex10 {
    //Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
    //Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu turno? ");
        System.out.println();
        System.out.println("M para Matutino ou V para Vespertino ou N para Noturno.");
        String turno = sc.next().toUpperCase();

        if (turno.equals("M")) {
            System.out.println("Matutino");
        } else if (turno.equals("V")) {
            System.out.println("Vespertino");
        } else if(turno.equals("N")) {
            System.out.println("Noturno");
        } else{
            System.out.println("Valor inválido");
        }
        sc.close();
    }
}


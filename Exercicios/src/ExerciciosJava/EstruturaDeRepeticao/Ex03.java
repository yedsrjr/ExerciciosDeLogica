package ExerciciosJava.EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        do {
            System.out.print("Nome: ");
            nome = sc.next();
        } while (nome.length() <= 3 );

        int idade;
        do {
            System.out.print("Idade: ");
            idade = sc.nextInt();
        } while (idade < 0 && idade > 150);

        double salario;
        do {
            System.out.print("Salário: ");
            salario = sc.nextDouble();
        } while (salario < 0);

        char sexo;
        do {
            System.out.print("Sexo (f/m): ");
            sexo = sc.next().charAt(0);
        }while (sexo != 'm' && sexo != 'f');

        char estado_civil;
        do {
            System.out.print("Estado Civil (s/c/v/d): ");
            estado_civil = sc.next().charAt(0);
        }while (estado_civil != 's' && estado_civil != 'c' && estado_civil != 'v' && estado_civil != 'd');

        System.out.println("-----FICHA-----");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estado_civil);

        sc.close();
    }
}

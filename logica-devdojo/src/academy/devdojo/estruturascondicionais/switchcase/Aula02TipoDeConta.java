package academy.devdojo.estruturascondicionais.switchcase;

import java.util.Scanner;

public class Aula02TipoDeConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite qual tipo de conta você deseja:");
        System.out.println("'1' para Conta Poupança");
        System.out.println("'2' para Conta Corrente");
        System.out.println("'3' para Conta Investimento");

        int conta = sc.nextInt();

        switch (conta) {
            case 1:
                System.out.println("A Conta Poupança oferece 0.05% de juros");
                break;
            case 2:
                System.out.println("A Conta Corrente oferece 0.02% de juros");
                break;
            case 3:
                System.out.println("A Conta Investimento oferece 0.1% de juros");
                break;
            default:
                System.out.println("Conta inexistente");
        }
        sc.close();
    }
}

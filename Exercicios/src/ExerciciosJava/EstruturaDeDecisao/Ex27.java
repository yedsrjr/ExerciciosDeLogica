package ExerciciosJava.EstruturaDeDecisao;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de morangos (em Kg): ");
        double quantidade_morangos = sc.nextInt();

        System.out.print("Digite a quantidade de maças (em Kg): ");
        double quantidade_macas = sc.nextInt();

        double valor_morango = calculaPrecoKG(quantidade_morangos, 2.5, 2.2);
        double valor_maca = calculaPrecoKG(quantidade_macas, 1.8, 1.5);

        double valor_total = valor_morango + valor_maca;

        double desconto = 0.1;
        if (quantidade_macas + quantidade_morangos > 8 || valor_total > 25) {
            valor_total = valor_total * (1 - desconto);
        }
        System.out.printf("Valor a ser pago: R$%.2f", valor_total);
    }
    private static double calculaPrecoKG(double quantidade, double precoAte5Kg, double precoAcima5Kg) {
        if (quantidade <= 5) {
            return quantidade * precoAte5Kg;
        } else {
            return quantidade * precoAcima5Kg;
        }
    }
}
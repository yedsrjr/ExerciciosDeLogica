package ExerciciosJava.EstruturaDeDecisao;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String combustivel;
        double litros, valor, desconto;
        double alcool = 1.90;
        double gasolina = 2.50;

        System.out.println("Digite o tipo de combustível (A-álcool, G-gasolina): ");
        combustivel = sc.next();

        System.out.println("Digite a quantidade de litros vendidos: ");
        litros = sc.nextInt();

        desconto = 0;
        valor = 0;

        if (combustivel.toLowerCase().equals("a") && litros <= 20) {
            desconto = 0.03;
            valor = litros * alcool * (1 - desconto);
        } else if (combustivel.toLowerCase().equals("a") && litros > 20) {
            desconto = 0.05;
            valor = litros * alcool * (1 - desconto);
        } else if (combustivel.toLowerCase().equals("g") && litros <= 20) {
            desconto = 0.04;
            valor = litros * gasolina * (1 - desconto);
        } else if (combustivel.toLowerCase().equals("g") && litros > 20) {
            desconto = 0.06;
            valor = litros * gasolina * (1 - desconto);
        }
        System.out.printf("Valor a ser pago R$%.2f", valor);
        sc.close();
    }
}

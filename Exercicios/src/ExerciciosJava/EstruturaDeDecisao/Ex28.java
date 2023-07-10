package ExerciciosJava.EstruturaDeDecisao;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor_total;
        System.out.print("Qual carne você deseja? File Duplo, Alcatra ou Picanha? ");
        String carne = sc.nextLine();

        System.out.print("Quantos Kg? ");
        double quantidade_carne = sc.nextDouble();

        double valor_file = calculaPrecoKg(quantidade_carne, 4.9, 5.8);
        double valor_alcatra = calculaPrecoKg(quantidade_carne, 5.9, 6.8);
        double valor_picanha = calculaPrecoKg(quantidade_carne, 6.9, 7.8);

        System.out.print("A compra foi realizada no cartão Tabajara? (S/N)");
        String pagamento = sc.next();
        System.out.println();

        double desconto = 0.05;
        if (carne.equalsIgnoreCase("FILE DUPLO") && pagamento.equalsIgnoreCase("S")) {
            desconto = desconto * valor_file;
            valor_total = valor_file - desconto;
            System.out.println("----CUPOM FISCAL----");
            System.out.println("Tipo de carne: " + carne);
            System.out.printf("Quantidade: %.2fKg%n", quantidade_carne);
            System.out.printf("Preço total: R$%.2f%n", (valor_file));
            System.out.println("Tipo de pagamento: Cartão Tabajara");
            System.out.printf("Desconto: R$%.2f%n", desconto);
            System.out.printf("Valor a pagar: R$%.2f%n", valor_total);
        } else if (carne.equalsIgnoreCase("file duplo")) {
            desconto = 0;
            System.out.println("----CUPOM FISCAL----");
            System.out.println("Produto: " + carne);
            System.out.printf("Peso: %.2fKg%n", quantidade_carne);
            System.out.printf("Preço total: R$%.2f%n", (valor_file));
            System.out.println("Pagamento: Cartão Tabajara");
            System.out.printf("Desconto: R$%.2f%n", desconto);
            System.out.printf("Valor: R$%.2f%n", valor_file);
        }
        if (carne.equalsIgnoreCase("ALCATRA") && pagamento.equalsIgnoreCase("S")) {
            desconto = desconto * valor_alcatra;
            valor_total = valor_alcatra - desconto;
            System.out.println("----CUPOM FISCAL----");
            System.out.println("Produto: " + carne.toLowerCase());
            System.out.printf("Peso: %.2fKg%n", quantidade_carne);
            System.out.printf("Preço total: R$%.2f%n", (valor_alcatra));
            System.out.println("Tipo de pagamento: Cartão Tabajara");
            System.out.printf("Desconto: R$%.2f%n", desconto);
            System.out.printf("Valor: R$%.2f%n", valor_total);
        } else if (carne.equalsIgnoreCase("ALCATRA")) {
            desconto = 0;
            System.out.println("----CUPOM FISCAL----");
            System.out.println("Produto: " + carne);
            System.out.printf("Peso: %.2fKg%n", quantidade_carne);
            System.out.printf("Preço total: R$%.2f%n", (valor_alcatra));
            System.out.println("Pagamento: Cartão Tabajara");
            System.out.printf("Desconto: R$%.2f%n", desconto);
            System.out.printf("Valor: R$%.2f%n", valor_alcatra);
        }
        if (carne.equalsIgnoreCase("picanha") && pagamento.equalsIgnoreCase("S")) {
            desconto = desconto * valor_picanha;
            valor_total = valor_picanha - desconto;
            System.out.println("----CUPOM FISCAL----");
            System.out.println("Produto: " + carne);
            System.out.printf("Peso: %.2fKg%n", quantidade_carne);
            System.out.printf("Preço total: R$%.2f%n", (valor_picanha));
            System.out.println("Tipo de pagamento: Cartão Tabajara");
            System.out.printf("Desconto: R$%.2f%n", desconto);
            System.out.printf("Valor: R$%.2f%n", valor_total);
        } else if (carne.equalsIgnoreCase("picanha")) {
            desconto = 0;
            System.out.println("----CUPOM FISCAL----");
            System.out.println("Produto: " + carne);
            System.out.printf("Peso: %.2fKg%n", quantidade_carne);
            System.out.printf("Preço total: R$%.2f%n", (valor_picanha));
            System.out.println("Pagamento: Cartão Tabajara");
            System.out.printf("Desconto: R$%.2f%n", desconto);
            System.out.printf("Valor: R$%.2f%n", valor_picanha);
        }
    }

    private static double calculaPrecoKg(double quantidade, double precoAte5Kg, double precoAcima5Kg) {
        if (quantidade <= 5) {
            return quantidade * precoAte5Kg;
        } else {
            return quantidade * precoAcima5Kg;
        }
    }
}

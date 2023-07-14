package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class CalculodoraImpostoSalario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu salário: ");
        double salario = sc.nextInt();

        if (salario >= 4500) {
            salario = salario * 0.3;
            System.out.println("O imposto de 30% é R$" + salario);
        } else {
            salario = salario * 0.15;
            System.out.println("O imposto de 15% é R$" + salario);
        }
    }
}


package ExerciciosJava.EstruturaDeDecisao;

import java.util.Scanner;

public class Ex11 {
            /*salários até R$ 280,00 (incluindo) : aumento de 20%
            salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
            salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
            salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado,

            informe na tela:
            o salário antes do reajuste;
            o percentual de aumento aplicado;
            o valor do aumento;
            o novo salário, após o aumento.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario, percentual, aumento, novoSalario;

        System.out.print("Qual o seu salário? ");
        salario = sc.nextDouble();

        if (salario <= 280) {
            percentual = 0.2;
            aumento = salario * percentual;
            novoSalario = salario + aumento;
            System.out.println("Salário Antigo: " + salario);
            System.out.printf("Aumento: %.2f%n", aumento);
            System.out.println("Percentual de aumento aplicado: " + percentual);
            System.out.println("Novo salário: " + novoSalario);
        } else if (salario >= 280 && salario <= 700) {
            percentual = 0.15;
            aumento = salario * percentual;
            novoSalario = salario + aumento;
            System.out.println("Salário Antigo: " + salario);
            System.out.printf("Aumento: %.2f%n", aumento);
            System.out.println("Percentual de aumento aplicado: " + percentual);
            System.out.println("Novo salário: " + novoSalario);
        } else if (salario >= 700 && salario < 1500) {
            percentual = 0.10;
            aumento = salario * percentual;
            novoSalario = salario + aumento;
            System.out.println("Salário Antigo: " + salario);
            System.out.printf("Aumento: %.2f%n", aumento);
            System.out.println("Percentual de aumento aplicado: " + percentual);
            System.out.println("Novo salário: " + novoSalario);
        } else {
            percentual = 0.05;
            aumento = salario * percentual;
            novoSalario = salario + aumento;
            System.out.println("Salário Antigo: " + salario);
            System.out.printf("Aumento: %.2f%n", aumento);
            System.out.println("Percentual de aumento aplicado: " + percentual);
            System.out.println("Novo salário: " + novoSalario);

            sc.close();
        }
    }

}

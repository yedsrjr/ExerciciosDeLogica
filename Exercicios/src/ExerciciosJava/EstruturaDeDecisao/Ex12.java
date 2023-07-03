package ExerciciosJava.EstruturaDeDecisao;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salarioBruto, inss, salarioLiquido, descontos, ir, fgts;
        int valorHora, horasTrabalhadas;

        System.out.print("Digite o valor da hora: ");
        valorHora = sc.nextInt();
        System.out.print("Digite quantas horas trabalhadas no mês: ");
        horasTrabalhadas = sc.nextInt();

        salarioBruto = valorHora * horasTrabalhadas;
        if (salarioBruto <= 900) {
            inss = salarioBruto * 0.1;
            fgts = (int) (salarioBruto * 0.11);
            descontos = inss;
            salarioLiquido = (salarioBruto - descontos);
            System.out.printf(" Salário Bruto: R$%.2f%n", salarioBruto);
            System.out.println(" (-) IR: Isento");
            System.out.printf(" (-) INSS: R$ %.2f", inss);
            System.out.printf(" (+) FGTS: R$ %.2f", fgts);
            System.out.printf(" Total de descontos: R$ %.2f", descontos);
            System.out.printf(" Salário Líquido: R$ %.2f", salarioLiquido);
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            ir = (salarioBruto * 0.05);
            inss = salarioBruto * 0.1;
            fgts = (salarioBruto * 0.11);
            descontos = inss + ir;
            salarioLiquido = (salarioBruto - descontos);
            System.out.printf(" Salário Bruto: R$ %.2f%n", salarioBruto);
            System.out.printf(" (-) IR: R$ %.2f%n", ir);
            System.out.printf(" (-) INSS: R$ %.2f%n", inss);
            System.out.printf(" (+) FGTS: R$ %.2f%n", fgts);
            System.out.printf(" Total de descontos: R$ %.2f%n", descontos);
            System.out.printf(" Salário Líquido: R$ %.2f%n", salarioLiquido);
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            ir = (int) (salarioBruto * 0.1);
            inss = salarioBruto * 0.1;
            fgts = (int) (salarioBruto * 0.11);
            descontos = inss + ir;
            salarioLiquido = (salarioBruto - descontos);
            System.out.printf(" Salário Bruto: R$ %.2f%n", salarioBruto);
            System.out.printf(" (-) IR: %.2f%n", ir);
            System.out.printf(" (-) INSS: R$ %.2f%n", inss);
            System.out.printf(" (+) FGTS: R$ %.2f%n", fgts);
            System.out.printf(" Total de descontos: R$ %.2f%n", descontos);
            System.out.printf(" Salário Líquido: R$ %.2f%n", salarioLiquido);
        } else {
            ir = (int) (salarioBruto * 0.2);
            inss = salarioBruto * 0.1;
            fgts = (int) (salarioBruto * 0.11);
            descontos = inss + ir;
            salarioLiquido = (salarioBruto - descontos);
            System.out.printf(" Salário Bruto: R$ %.2f%n", salarioBruto);
            System.out.printf(" (-) IR: R$ %.2f%n", ir);
            System.out.printf(" (-) INSS: R$ %.2f%n", inss);
            System.out.printf(" (+) FGTS: R$ %.2f%n", fgts);
            System.out.printf(" Total de descontos: R$ %.2f%n", descontos);
            System.out.printf(" Salário Líquido: R$ %.2f%n", salarioLiquido);
        }
        sc.close();
    }
}
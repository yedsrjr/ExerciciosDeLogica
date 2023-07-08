package ExerciciosJava.EstruturaDeDecisao;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, soma, subtracao, divisao, multiplicacao;
        String operacao;

        System.out.print("Digite o 1º número: ");
        n1 = sc.nextDouble();
        System.out.print("Digite o 2º número: ");
        n2 = sc.nextDouble();
        System.out.println();

        System.out.println("Qual operação matemática você deseja? ");
        System.out.println("Soma(+)  Subtração(-) Multiplicação(*) Divisão(/)");
        operacao = sc.next();

        if (operacao.equals("+")) {
            soma = n1 + n2;
            if (soma == Math.round(soma) && soma > 0) {
                System.out.println(soma + ", inteiro" + " e positivo.");
            } else if (soma == Math.round(soma) && soma < 0) {
                System.out.println(soma + ", inteiro" + " e negativo.");
            } else if (soma != Math.round(soma) && soma > 0) {
                System.out.println(soma + ", decimal" + " e positivo.");
            } else if (soma != Math.round(soma) && soma < 0) {
                System.out.println(soma + ", decimal" + " e negatio.");
            }
        }
        if (operacao.equals("-")) {
            subtracao = n1 - n2;
            if (subtracao == Math.round(subtracao) && subtracao > 0) {
                System.out.println(subtracao + ", inteiro" + " e positivo.");
            } else if (subtracao == Math.round(subtracao) && subtracao < 0) {
                System.out.println(subtracao + ", inteiro" + " e negativo.");
            } else if (subtracao != Math.round(subtracao) && subtracao > 0) {
                System.out.println(subtracao + ", decimal" + " e positivo.");
            } else if (subtracao != Math.round(subtracao) && subtracao < 0) {
                System.out.println(subtracao + ", decimal" + " e negatio.");
            }
        }
        if (operacao.equals("*")) {
            multiplicacao = n1 * n2;
            if (multiplicacao == Math.round(multiplicacao) && multiplicacao > 0) {
                System.out.println(multiplicacao + ", inteiro" + " e positivo.");
            } else if (multiplicacao == Math.round(multiplicacao) && multiplicacao < 0) {
                System.out.println(multiplicacao + ", inteiro" + " e negativo.");
            } else if (multiplicacao != Math.round(multiplicacao) && multiplicacao > 0) {
                System.out.println(multiplicacao + ", decimal" + " e positivo.");
            } else if (multiplicacao != Math.round(multiplicacao) && multiplicacao < 0) {
                System.out.println(multiplicacao + ", decimal" + " e negatio.");
            }
        }
        if (operacao.equals("/")) {
            divisao = n1 / n2;
            if (divisao != Math.round(divisao) && divisao > 0) {
                System.out.println(divisao + ", decimal" + " e positivo.");
            } else if (divisao != Math.round(divisao) && divisao < 0) {
                System.out.println(divisao + ", decimal" + " e negativo.");
            } else if (divisao == Math.round(divisao) && divisao > 0) {
                System.out.println(divisao + ", inteiro" + " e positivo.");
            } else if (divisao == Math.round(divisao) && divisao < 0) {
                System.out.println(divisao + ", inteiro" + " e negativo.");
            }
        }
        sc.close();
    }
}


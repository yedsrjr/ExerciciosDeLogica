package ExerciciosJava.EstruturaDeDecisao;

import java.util.Scanner;

public class Ex08 {
    //Faça um programa que pergunte o preço de três produtos e
    // informe qual produto você deve comprar,
    //sabendo que a decisão é sempre pelo mais barato.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o preço da TV Smart Samsung 50'? ");
        int produto1 = sc.nextInt();
        System.out.print("Qual o preço do Playstation 5? ");
        int produto2 = sc.nextInt();
        System.out.print("Qual o preço do Macbook Air? ");
        int produto3 = sc.nextInt();

        int menor = produto1;
        if(produto2 < menor){
            menor = produto2;
        } else if (produto3 < menor) {
            menor = produto3;
        }
        System.out.printf("Você deve comprar o produto mais barato que custa R$ %d", menor);
        sc.close();
    }
}

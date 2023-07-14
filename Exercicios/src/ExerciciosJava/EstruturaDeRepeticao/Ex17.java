package ExerciciosJava.EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fatorial = 1;

        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        System.out.print("Fatorial de " + n + "! = ");
        while (n >= 1){
            fatorial *= n;
            n -= 1;
        }
        System.out.print(fatorial);

        sc.close();
    }
}

package ExerciciosJava.EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base, potencia;
        int result = 1;

        System.out.print("Digite o valor da base: ");
        base = sc.nextInt();

        System.out.print("Digite o valor do potência: ");
        potencia = sc.nextInt();

        while (potencia != 0){
            result = result * base;
            potencia--;
        }
        System.out.println("Resultado: "+ result);

        sc.close();
    }
}

package ExerciciosJava.EstruturaDeDecisao;

import java.util.Scanner;
public class Ex16 {
    // Calculadora de equação do segundo grau.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, delta;
        System.out.print("Digite o valor de A: ");
        a = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        b = sc.nextInt();
        System.out.print("Digite o valor de C: ");
        c = sc.nextInt();

        delta = (Math.pow(b, 2)) - 4 * a * c;
        double x1 =  (-b + Math.sqrt(delta))/(2*a);
        double x2 =  (-b - Math.sqrt(delta))/(2*a);

        if(a == 0){
            System.out.println("A é igual a 0, portanto, a equação não é do segundo grau.");
        } else if (delta < 0){
            System.out.println("A equação não possui raizes reais");
            System.out.printf("x1 = %.1f%n", x1);
            System.out.printf("x2 = %.1f%n", x2);
        } else if (delta == 0) {
            System.out.printf("x1 = %.1f%n", x1);
            System.out.printf("x2 = %.1f%n", x2);
        }else {
            System.out.printf("x1 = %.1f%n", x1);
            System.out.printf("x2 = %.1f%n", x2);
        }
        sc.close();
    }
}

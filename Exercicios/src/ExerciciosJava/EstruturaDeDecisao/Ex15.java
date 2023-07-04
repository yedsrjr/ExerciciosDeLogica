package ExerciciosJava.EstruturaDeDecisao;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c;
        System.out.print("Digite o valor de lado A do triângulo: ");
        a = sc.nextDouble();
        System.out.print("Digite o valor de lado B do triângulo: ");
        b = sc.nextDouble();
        System.out.print("Digite o valor de lado C do triângulo: ");
        c = sc.nextDouble();
        System.out.println();

        if(a != b && b != c && a != c){
            System.out.println("Triângulo Escaleno");
        } else if(a == b && b == c && c == a){
            System.out.println("Triângulo Equilátero");
        } else {
            System.out.println("Isósceles");
        }
        sc.close();
    }
}

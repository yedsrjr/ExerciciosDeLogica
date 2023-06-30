package ExerciciosJava.EstruturaDeDecisao;

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
    // Faça um Programa que verifique se uma letra digitada é "F" ou "M".
    // Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite F - Feminino, M - Masculino: ");
        String carct = sc.next().toUpperCase();
        if(carct.equals("F")){
            System.out.println("Feminino");
        } else if (carct.equals("M")) {
            System.out.println("Masculino");
        } else {
            System.out.println("Sexo Inválido");
        }
    }
}

package ExerciciosJava.EstruturaDeDecisao;

import java.util.Scanner;

public class Ex04 {
    // Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] vogais = {"a", "e", "i", "o", "u"};
        System.out.print("Digite uma letra: ");
        String letra = sc.next().toUpperCase();

        if(letra.equals(vogais[0]) || letra.equals(vogais[1]) && letra.equals(vogais[2])){
            System.out.printf("%s, é uma vogal.", letra);
        } else if (letra.equals(vogais[3]) && letra.equals(vogais[4])) {
            System.out.printf("%s, é uma vogal.", letra);
        } else {
            System.out.printf("%s, é uma consoante.", letra);
        }
        sc.close();
    }
}

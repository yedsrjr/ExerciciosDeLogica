package ExerciciosJava.EstruturaDeDecisao;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, centena, dezena, unidade;

        System.out.print("Digite um número inteiro positivo: ");
        numero = sc.nextInt();

        String resultado = numero + " = ";
        if(numero < 1000){
            unidade = numero % 10;

            numero = (numero - unidade)/10;

            dezena = numero % 10;

            numero = (numero - dezena)/10;
            centena = numero;
            System.out.println(resultado + centena + " centena(s), "
                    + dezena + " dezena(s), " + unidade + " unidade(s)");
        }
        sc.close();
    }
}

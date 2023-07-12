package ExerciciosJava.EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da tabuada: ");
        int tabuada = sc.nextInt();
        System.out.println("Tabuada de "+ tabuada + ":");
        for (int i = 0; i <= 10; i++){
            System.out.println(tabuada + " x " + i +  " = " + (tabuada*i));
        }
        sc.close();
    }
}

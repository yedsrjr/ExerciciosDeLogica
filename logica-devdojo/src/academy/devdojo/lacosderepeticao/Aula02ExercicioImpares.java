package academy.devdojo.lacosderepeticao;

import java.util.Scanner;

public class Aula02ExercicioImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroFinal = sc.nextInt();
        int i = 0;

        while(i <= numeroFinal){
            if(i%2 != 0){
                System.out.println("i = " + i);
            }
            i += 1;
        }
    }
}

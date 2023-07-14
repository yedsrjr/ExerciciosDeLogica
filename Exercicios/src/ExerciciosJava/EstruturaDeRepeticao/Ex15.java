package ExerciciosJava.EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int termo1 = 1;
        int termo2 = 1;

        System.out.println("Digite qual termo deseja: ");
        int n = sc.nextInt();
        if(n <= 0) {
            System.out.println("O valor de n deve ser maior que de 0.");
        } else if(n == 1){
            System.out.println("Série de Fibonacci até o " + n + " termo:");
        } else {
            System.out.println("Série de Fibonacci até o " + n + " termo:");
            System.out.println(termo1);
            System.out.println(termo2);
        }

        for (int i = 3; i <= n; i++){
             int proximo_termo = termo1 + termo2;
            System.out.println(proximo_termo);
             termo1 = termo2;
             termo2 = proximo_termo;
        }
        sc.close();
    }

}

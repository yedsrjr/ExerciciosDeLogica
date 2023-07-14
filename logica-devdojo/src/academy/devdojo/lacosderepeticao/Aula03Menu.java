package academy.devdojo.lacosderepeticao;
import java.util.Scanner;

public class Aula03Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 1 para Calcular Imposto");
        System.out.println("Digite 2 para Deposita Salário");
        System.out.println("Digite 3 para Sair");
        int n = 0;

        while(n != 3){
            n = sc.nextInt();
            if(n == 1){
                System.out.println("Calcula Imposto");
            } else if(n == 2){
                System.out.println("Deposita Salário");
            } else if(n >= 4 || n <= 0){
                System.out.println("Número inválido");
            } else {
                break;
            }
        }
    }
}

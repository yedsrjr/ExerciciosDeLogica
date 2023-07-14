package academy.devdojo.estruturascondicionais.ifselse;
import java.util.Scanner;
public class ImparOuPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numéro: ");
        int n = sc.nextInt();

        if(n%2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("ÍMPAR");
        }
        sc.close();
    }
}

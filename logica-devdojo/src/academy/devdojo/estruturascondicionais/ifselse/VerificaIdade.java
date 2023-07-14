package academy.devdojo.estruturascondicionais.ifselse;
import java.util.Scanner;

public class VerificaIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();


        if(idade >= 18){
            System.out.println("Adulto");
        } else {
            System.out.println("Ainda não é adulto");
        }

    }
}

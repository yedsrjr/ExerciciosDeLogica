package academy.devdojo.estruturascondicionais.ifselse;
import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        if(idade <= 10){
            System.out.println(nome + " participará da categoria Infantil");
        } else if(idade >= 11 && idade <= 15){
            System.out.println(nome + " participará da categoria Juvenil");
        } else if(idade >= 16 && idade <= 19){
            System.out.println(nome + " participará da categoria Pré-Adulto");
        } else {
            System.out.println(nome + " participará da categoria Adulto");
        }
    }
}

package academy.devdojo.estruturascondicionais.ifselse;
import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o sexo: M para masculino e F para feminino: ");
        String sexo = sc.next();
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if(sexo.equalsIgnoreCase("M") && idade >= 18){
            System.out.println("Alistamento obrigatório");
        } else if(sexo.equalsIgnoreCase("M") && idade < 18){
            System.out.println("Alistamento não permitido");
        } else if(sexo.equalsIgnoreCase("F") && idade >= 18) {
            System.out.println("Você deseja se alistar?");
        } else {
            System.out.println("Alistamento não permitido");
        }

        sc.close();
    }
}

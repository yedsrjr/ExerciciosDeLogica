package academy.devdojo.estruturascondicionais.ifselse;
import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu login: ");
        String login = sc.nextLine();

        if(login.equals("admin") || login.equals("administrador")){
            System.out.println("Usuário inválido");
        } else {
            System.out.println(login + "Cadastro realizado com sucesso");
        }
        sc.close();
    }
}

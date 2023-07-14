package academy.devdojo.lacosderepeticao;

import java.util.Scanner;

public class Aula04Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String login = "Eds123";
        String senha = "321";
        boolean telaLogin = true;

        while (telaLogin) {
            System.out.print("Digite seu login: ");
            String id = sc.nextLine();
            System.out.print("Digite sua senha: ");
            String password = sc.nextLine();
            if (login.equals(id) && senha.equals(password)) {
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Acesso Negado");
            }
        }
        System.out.println("Fim do Programa");
    }
}

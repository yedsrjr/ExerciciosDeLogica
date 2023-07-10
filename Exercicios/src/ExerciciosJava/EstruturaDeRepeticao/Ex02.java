package ExerciciosJava.EstruturaDeRepeticao;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Login: ");
        String login = sc.next();
        System.out.println("Senha: ");
        String password = sc.next();

        while (login.equals(password) || password.equals(login)){
            System.out.println("Login e/ou senha inválidos(s). Tente novamente.");
            System.out.println("Login: ");
            login = sc.next();
            System.out.println("Senha: ");
            password = sc.next();
        }
        System.out.println("Login efetuado com sucesso!");
    }
}

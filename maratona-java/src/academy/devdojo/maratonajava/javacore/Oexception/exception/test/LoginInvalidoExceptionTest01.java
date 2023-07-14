package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();;
        }
    }
    private static void login() throws LoginInvalidoException {
        Scanner sc = new Scanner(System.in);
        String usarnameDB = "3dse_n";
        String passwordDB = "@135723Ed";
        System.out.print("Usuário: ");
        String usuarioDigitada = sc.next();
        System.out.print("Senha: ");
        String senhaDigitada = sc.next();
        if(!usuarioDigitada.equals(usarnameDB) || !senhaDigitada.equals(passwordDB)){
            throw new LoginInvalidoException("Usuário ou Senha inválidos");
        }
        System.out.println("Usuário logado com sucesso");
    }
}

package academy.devdojo.maratonajava.javacore.Oexception.exception.domain;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Funcionario extends Pessoa{

    public static void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("salvando arquivo");
    }
}

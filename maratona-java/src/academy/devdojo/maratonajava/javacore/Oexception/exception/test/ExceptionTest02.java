package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }
    public static void criarNovoArquivo() throws IOException{
        File file = new File("arquivo\\test.txt");
        try {
            boolean isCriaddo = file.createNewFile();
            System.out.println("Arquivo Criado " + isCriaddo);
        }catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }
}

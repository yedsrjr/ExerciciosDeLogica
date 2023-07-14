package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException | IllegalArgumentException  e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | ArithmeticException | IllegalArgumentException");
        }catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        }catch (SQLException | IOException e){
            e.printStackTrace();
        }
    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
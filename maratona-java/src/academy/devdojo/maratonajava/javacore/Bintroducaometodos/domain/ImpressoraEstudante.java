package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

import java.util.Calendar;
import java.util.Date;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println("----------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
    public void getDataAniversario(Estudante estudante){
        Date data = new Date();
        int anoAtual = data.getYear() + 1900;
        System.out.println(anoAtual - estudante.idade);
    }
}

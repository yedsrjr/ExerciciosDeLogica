package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

import java.util.Date;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;
    public Date nascimento;

    public void imprime(){
        System.out.println("------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
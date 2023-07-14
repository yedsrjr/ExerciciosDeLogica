package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Leonel");
        endereco.setCep("75920000");
        Pessoa pessoa = new Pessoa("Edson");
        pessoa.setCpf("06327084176");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("---------------------");
        Funcionario funcionario = new Funcionario("Sub-Zero");
        funcionario.setCpf("1248211-84");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(5000);
        funcionario.imprime();
    }
}

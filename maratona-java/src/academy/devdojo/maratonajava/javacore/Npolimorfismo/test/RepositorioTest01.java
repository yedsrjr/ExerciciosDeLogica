package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioArquivo;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Oh Neymar");
        list.add("Oh Neymar");
        list.add("Oh Neymar");
        System.out.println(list);
    }
}

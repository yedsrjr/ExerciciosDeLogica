package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando arquivos");
    }

    @Override
    public void remove() {
        System.out.println("Deletando dados de um arquivo");
    }

    @Override
    public void checkpermission() {
        System.out.println("Checando permissões no arquivo");
    }
}

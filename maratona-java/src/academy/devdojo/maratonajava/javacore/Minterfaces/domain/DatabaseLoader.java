package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do Banca de Dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkpermission() {
        System.out.println("Checando permissões no banco de dados");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na classe DatabaseLoader");
    }
}

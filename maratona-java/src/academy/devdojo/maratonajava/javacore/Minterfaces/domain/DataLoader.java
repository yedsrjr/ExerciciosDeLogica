package academy.devdojo.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    public static int MAX_DATA_SIZE = 10;
    public void load();
    default void checkpermission(){
        System.out.println("Fazendo checagem de permissões");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize");
    }
}

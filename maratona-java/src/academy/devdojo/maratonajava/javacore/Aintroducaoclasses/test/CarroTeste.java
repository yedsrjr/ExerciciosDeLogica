package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;
import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Civic";
        carro01.modelo = "Sedan";
        carro01.ano = 2023;

        carro02.nome = "Fusion";
        carro02.modelo = "Sedan";
        carro02.ano = 2020;

        carro01 = carro02;

        System.out.println("Nome: " + carro01.nome + ", Modelo: " + carro01.modelo + ", Ano: " + carro01.ano);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Nome: " + carro02.nome + ", Modelo: " + carro02.modelo + ", Ano: " + carro02.ano);




    }
}

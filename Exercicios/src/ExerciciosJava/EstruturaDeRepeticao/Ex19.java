package ExerciciosJava.EstruturaDeRepeticao;

import java.util.Random;

public class Ex19 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[3];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) ;
        }

        int maior = array[0];
        int menor = array[0];
        int soma = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] < menor){
                menor = array[i];
            }
            if (array[i] > maior){
                maior = array[i];
            }
            soma = maior + menor;
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Soma dos valores: " + soma);
    }
}


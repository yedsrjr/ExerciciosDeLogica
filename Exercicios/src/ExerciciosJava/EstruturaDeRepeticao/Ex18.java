package ExerciciosJava.EstruturaDeRepeticao;

import java.util.Random;

public class Ex18 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[3];
        int maior = 0;
        int menor = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        if (array[0] > array[1] && array[0] > array[2]) {
            maior = array[0];
        } else if (array[1] > array[0] && array[1] > array[2]) {
            maior = array[1];
        } else {
            maior = array[2];
        }
        if (array[0] < array[1] && array[0] < array[2]) {
            menor = array[0];
        } else if (array[1] < array[0] && array[1] < array[2]) {
            menor = array[1];
        } else {

            menor = array[2];
        }
        int soma = maior + menor;
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Soma dos valores: " + soma);
    }
}


package academy.devdojo.arrays.multidimensionais;

public class Aula01IntroducaoArraysMultidimensionais {
    public static void main(String[] args) {

        int[][] arrayMulti = new int[2][2];

        arrayMulti[0][0] = 22;
        arrayMulti[0][1] = 32;
        arrayMulti[1][0] = 25;
        arrayMulti[1][1] = 47;
        System.out.println(arrayMulti[0][0]);
        System.out.println(arrayMulti[0][1]);
        System.out.println(arrayMulti[1][0]);
        System.out.println(arrayMulti[1][1]);
    }
}

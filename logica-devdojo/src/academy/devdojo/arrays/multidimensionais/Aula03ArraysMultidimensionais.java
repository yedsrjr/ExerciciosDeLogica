package academy.devdojo.arrays.multidimensionais;

public class Aula03ArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] arrayMulti = new int[3][3];
        arrayMulti[0][0] = 2;
        arrayMulti[0][1] = 4;
        arrayMulti[0][2] = 5;
        arrayMulti[1][0] = 6;
        arrayMulti[1][1] = 7;
        arrayMulti[1][2] = 8;
        arrayMulti[2][0] = 9;
        arrayMulti[2][1] = 10;
        arrayMulti[2][2] = 11;

        int multiplicacao_diagonal = 1;
        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                if (i == j) {
                    multiplicacao_diagonal = multiplicacao_diagonal * arrayMulti[i][j];
                }
            }
        }
        System.out.println(multiplicacao_diagonal);
    }
}

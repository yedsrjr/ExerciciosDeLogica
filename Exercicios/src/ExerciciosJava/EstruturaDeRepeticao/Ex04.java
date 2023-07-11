package ExerciciosJava.EstruturaDeRepeticao;

public class Ex04 {
    public static void main(String[] args) {
        int pais_A = 80000;
        int pais_B = 200000;
        int anos;

        for(anos = 0; pais_A < pais_B; anos++){
            pais_A += pais_A * 0.03;
            pais_B += pais_B * 0.015;

        }
        System.out.println(anos + " anos");
    }
}

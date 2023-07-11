package ExerciciosJava.EstruturaDeRepeticao;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de habitantes do País A: ");
        double pais_A = sc.nextDouble();

        System.out.print("Digite o número de habitantes do País B: ");
        double pais_B = sc.nextDouble();

        System.out.print("Digite a taxa anual de crescimento do País A (ex: '0,02', '0,015'...): ");
        double taxa_crescimentoA = sc.nextDouble();

        System.out.print("Digite a taxa anual de crescimento do País B (ex: '0.02', '0.015'...): ");
        double taxa_crescimentoB = sc.nextDouble();

        double anos;
        if(taxa_crescimentoB < taxa_crescimentoA){
            for(anos = 0; pais_A < pais_B; anos++){
                pais_A += pais_A * taxa_crescimentoA;
                pais_B += pais_B * taxa_crescimentoB;
            }
        } else {
            System.out.println("Valor da taxa de crescimento do país B maior que do país A. Digite novamente!");
            return;
        }
        System.out.printf("%.0f anos", anos);
        sc.close();
    }
}

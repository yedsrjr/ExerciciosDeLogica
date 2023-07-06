package ExerciciosJava.EstruturaDeDecisao;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String dataString = scanner.nextLine();

        if (validarData(dataString)) {
            System.out.println("A data é válida.");
        } else {
            System.out.println("A data é inválida.");
        }
        scanner.close();
    }
    public static boolean validarData(String dataString) {
        String[] partesData = dataString.split("/");

        if (partesData.length != 3) {
            return false;
        }

        int dia, mes, ano;
        try {
            dia = Integer.parseInt(partesData[0]);
            mes = Integer.parseInt(partesData[1]);
            ano = Integer.parseInt(partesData[2]);
        } catch (NumberFormatException e) {
            return false;
        }

        if (ano < 0 || mes < 1 || mes > 12 || dia < 1) {
            return false;
        }

        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            diasPorMes[1] = 29; // Ano bissexto, fevereiro tem 29 dias
        }

        if (dia > diasPorMes[mes - 1]) {
            return false;
        }

        return true;
    }
}


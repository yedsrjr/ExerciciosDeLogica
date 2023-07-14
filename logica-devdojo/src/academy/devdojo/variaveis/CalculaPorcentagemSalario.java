package academy.devdojo.variaveis;

import java.util.Scanner;

public class CalculaPorcentagemSalario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salary, percentage, calculation;

        System.out.print("Enter your salary amount: ");
        salary = sc.nextDouble();
        System.out.print("Enter the percentage value you want to calculate: ");
        percentage = sc.nextDouble();

        calculation = salary * percentage / 100;
        System.out.println("The percentage calculated is US$" + calculation);


    }

}

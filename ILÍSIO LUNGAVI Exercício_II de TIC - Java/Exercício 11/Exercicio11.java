package com.company;
import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        float salario_Minimo = scanner.nextFloat();
        System.out.print("Digite o salário do funcionário: ");
        float salario_Funcionario = scanner.nextFloat();

        float quant_Salarios_Minimos = salario_Funcionario / salario_Minimo;

        System.out.println("O funcionário recebe " + quant_Salarios_Minimos + " salários mínimos");

        System.out.println("\n");
    }
}

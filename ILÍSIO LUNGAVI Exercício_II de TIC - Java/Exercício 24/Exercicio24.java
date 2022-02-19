package com.company;
import java.util.Scanner;
public class Exercicio24 {
    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print("Digite  o salário base: ");
        double salario_base = Double.parseDouble(scanner.nextLine());

        double gratificacao = salario_base * (50.0 / 100);

        double imposto = salario_base * (10.0 / 100);

        double novo_salario = salario_base + gratificacao - imposto;

        System.out.println("Gratificação é = "+gratificacao);
        System.out.println("Imposto é = " +imposto);
        System.out.println("Novo Salário é = " +novo_salario);
    }
}
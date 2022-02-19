package com.company;
import java.util.Scanner;
public class Exercicio17 {
    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        double salario;
        double novo_salario;
        double aumento = 0.25;

        System.out.println("Digite o salario:");
        salario = scanner.nextDouble();

        novo_salario = salario + (salario * aumento);
        System.out.println("O novo salário com percentual de aumento é ="+novo_salario);
    }
}

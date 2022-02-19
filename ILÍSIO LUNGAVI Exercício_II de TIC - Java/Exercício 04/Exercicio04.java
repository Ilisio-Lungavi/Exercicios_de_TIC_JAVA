package com.company;
import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        float valor1;
        float valor2;
        Float div;

        Scanner scanner;

        scanner = new Scanner(System.in);
        System.out.println("Digite o Primeiro Número");
        valor1 = scanner.nextFloat();
        System.out.println("Digite o Segundo Número");
        valor2 = scanner.nextFloat();

        div = valor1 / valor2;

        System.out.println("A Subtração dos dois Números é =" +div);
    }
}

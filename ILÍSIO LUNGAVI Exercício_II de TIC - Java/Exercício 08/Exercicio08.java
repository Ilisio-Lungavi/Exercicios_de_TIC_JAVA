package com.company;
import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {

        float lado1;
        float lado2;
        float A;

        Scanner scanner;

        scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro lado:");
        lado1 = scanner.nextFloat();
        System.out.println("Digite o segundo lado:");
        lado2 = scanner.nextFloat();

        A = lado1 * lado2;

        System.out.println("A área do quadrado é =" +A);
    }
}

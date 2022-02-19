package com.company;
import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {

        int valor1;
        int valor2;
        int sub;

        Scanner scanner;

        scanner = new Scanner(System.in);
        System.out.println("Digite o Primeiro Número");
        valor1 = scanner.nextInt();
        System.out.println("Digite o Segundo Número");
        valor2 = scanner.nextInt();

        sub = valor1 - valor2;

        System.out.println("A Subtração dos dois Números é =" +sub);

    }
}

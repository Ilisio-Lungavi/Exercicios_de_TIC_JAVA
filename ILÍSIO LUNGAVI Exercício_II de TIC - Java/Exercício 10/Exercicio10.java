package com.company;
import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        float base_maior;
        float base_menor;
        float altura;
        float A;

        Scanner scanner;

        scanner = new Scanner(System.in);
        System.out.println("Digite A base maior:");
        base_maior = scanner.nextFloat();
        System.out.println("Digite A base menor:");
        base_menor = scanner.nextFloat();
        System.out.println("Digite A altura:");
        altura = scanner.nextFloat();

        A = ((base_maior + base_menor) * altura) /2;

        System.out.println("A área do trapézio é =" +A);
    }
}

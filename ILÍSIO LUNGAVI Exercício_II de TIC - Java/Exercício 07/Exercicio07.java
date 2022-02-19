package com.company;
import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {

        float diagonal_maior;
        float diagonal_menor;
        float A;

        Scanner scanner;

        scanner = new Scanner(System.in);
        System.out.println("Digite A Diagonal maior:");
        diagonal_maior = scanner.nextFloat();
        System.out.println("Digite A Diagonal menor:");
        diagonal_menor = scanner.nextFloat();

        A = (diagonal_maior * diagonal_menor) / 2;

        System.out.println("A área do losango é =" +A);
    }
}

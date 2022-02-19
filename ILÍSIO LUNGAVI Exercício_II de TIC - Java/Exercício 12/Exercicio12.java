package com.company;
import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        float base;
        float altura;
        float A;

        Scanner scanner;

        scanner = new Scanner(System.in);
        System.out.println("Digite A base:");
        base = scanner.nextFloat();
        System.out.println("Digite A altura:");
        altura = scanner.nextFloat();

        A = (base * altura) /2;

        System.out.println("A área do trinângulo é =" +A);
    }
}

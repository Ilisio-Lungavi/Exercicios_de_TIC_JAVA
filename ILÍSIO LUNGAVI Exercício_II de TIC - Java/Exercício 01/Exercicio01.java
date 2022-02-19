package com.company;
import java.util.Scanner;
public class Exercicio01 {

    public static void main(String[] args) {
        int valor1;
        int valor2;
        int valor3;
        int valor4;

        Scanner scanner;

        scanner = new Scanner(System.in);
        System.out.println("Digite o Primeiro Número");
        valor1 = scanner.nextInt();
        System.out.println("Digite o Segundo Número");
        valor2 = scanner.nextInt();
        System.out.println("Digite o Terceiro Número");
        valor3 = scanner.nextInt();
        System.out.println("Digite o Quarto Número");
        valor4 = scanner.nextInt();

        int soma = valor1 + valor2 + valor3 + valor4;

        System.out.println("A Soma dos quatro Números é =" +soma);


    }
}
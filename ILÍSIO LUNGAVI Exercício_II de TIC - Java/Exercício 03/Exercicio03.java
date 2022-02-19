package com.company;
import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        int valor1;
        int valor2;
        int valor3;


        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Digite o Primeiro valor");
        valor1 = scanner.nextInt();
        System.out.println("Digite o Segundo valor");
        valor2 = scanner.nextInt();
        System.out.println("Digite o Terceiro valor");
        valor3 = scanner.nextInt();
        int mult  = valor1 * valor2 * valor3;
        System.out.println("A Multiplicação é igual a =" + mult);
    }
}

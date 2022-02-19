package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Exercicio15 {
    public static void main(String[] args) {

        double valor1;
        double valor2;

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        valor1 = scanner.nextInt();
        System.out.println("Digite o segundo valor");
        valor2 = scanner.nextInt();

        System.out.println(+valor1+"elevado ao "+valor2+":" + Math.pow((double) valor1,(double)valor2));
        System.out.println(+valor2+"elevado ao "+valor1+":" + Math.pow((double) valor2,(double)valor2));

    }
}

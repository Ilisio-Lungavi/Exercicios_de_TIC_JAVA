package com.company;
import java.util.Scanner;
public class Exercicio14 {
    public static void main(String[] args) {

        int ano_actual;
        int ano_nasc;

        Scanner scanner;

        scanner = new Scanner(System.in);
        System.out.println("Digite o ano actual:");
        ano_actual = scanner.nextInt();
        System.out.println("Digite o ano de nascimento:");
        ano_nasc = scanner.nextInt();

        int idade_Anos;
        idade_Anos = ano_actual - ano_nasc;
        System.out.println("A idade em anos é: " + idade_Anos);

        int idade_Meses;
        idade_Meses = idade_Anos * 12;
        System.out.println("A idade em meses é: " + idade_Meses);

        // calcula a idade em dias
        int idade_Dias;
        idade_Dias = idade_Anos * 12 * 30;
        System.out.println("A idade em dias é: " + idade_Dias);

        // calcula a idade em semanas
        int idade_Semanas;
        idade_Semanas = idade_Anos * 52;
        System.out.println("A idade em semanas é: " + idade_Semanas);

        System.out.println("\n");

    }
}

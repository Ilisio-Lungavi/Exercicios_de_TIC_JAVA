package com.company;
import java.util.Scanner;
public class Exercicio25 {
    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        float deposito;
        float taxa_juros;
        float rendimento;
        float rendimento_final;

        System.out.println("Digite o Valor do depósito:");
        deposito = scanner.nextFloat();

        System.out.println("Digite o Valor da táxa de juros:");
        taxa_juros = scanner.nextFloat();

        rendimento = deposito * (taxa_juros / 100);
        System.out.println("O rendimento é = " +rendimento);

        rendimento_final = deposito + rendimento;
        System.out.println("O rendimento final é = " +rendimento_final);

    }
}
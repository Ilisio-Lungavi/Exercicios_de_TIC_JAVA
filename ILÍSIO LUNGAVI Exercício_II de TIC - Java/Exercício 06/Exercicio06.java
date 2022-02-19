package com.company;
import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        int nota1;
        int nota2;
        int nota3;

        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Digite a Primeira Nota");
        nota1 = scanner.nextInt();
        System.out.println("Digite a Segunda Nota");
        nota2 = scanner.nextInt();
        System.out.println("Digite a Terceira Nota");
        nota3 = scanner.nextInt();

        int P1;
        int P2;
        int P3;

        System.out.println("Digite o Primeiro peso");
        P1 = scanner.nextInt();
        System.out.println("Digite o Segundo peso");
        P2 = scanner.nextInt();
        System.out.println("Digite o Terceiro peso");
        P3 = scanner.nextInt();


        float media1 = (P1 * nota1) + (P2 * nota2) + (P3 * nota3) / P1 + P2 + P3;
        System.out.println("Sua media ponderada é = " + media1);
    }
}

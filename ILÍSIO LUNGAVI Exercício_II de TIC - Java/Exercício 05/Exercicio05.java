package com.company;
import java.util.Scanner;
public class Exercicio05 {
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
        float media1 = (nota1 + nota2 + nota3) / 3;
        System.out.println("Sua media é:" + media1);
    }
}
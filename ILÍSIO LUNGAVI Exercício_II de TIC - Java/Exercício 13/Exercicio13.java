package com.company;
import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {

        int idade;
        int ano_actual;
        int ano_nasc;
        int quant;
        int ano_qt = 2050;

        Scanner scanner;

        scanner = new Scanner(System.in);
        System.out.println("Digite o ano actual:");
        ano_actual = scanner.nextInt();
        System.out.println("Digite o ano de nascimento:");
        ano_nasc = scanner.nextInt();

        idade = ano_actual - ano_nasc;
        System.out.println("A idade dessa pessoa é ="+ idade);

            quant = ano_qt - ano_nasc;

        System.out.println("A idade que essa pessoa téra em 2050 é:" +quant);


    }
}

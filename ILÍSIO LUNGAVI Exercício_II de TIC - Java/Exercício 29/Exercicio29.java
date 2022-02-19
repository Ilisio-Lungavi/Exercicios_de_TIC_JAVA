package com.company;
import java.util.Scanner;
public class Exercicio29 {
    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        double cheque1;
        double cheque2;
        double salario;

        System.out.println("Digite o salário do funcionário:");
        salario = scanner.nextDouble();

        System.out.println("Digite o valor do primeiro cheque emitido pelo funcionário:");
        cheque1 = scanner.nextDouble();

        System.out.println("Digite o valor do segundo cheque emitido pelo funcionário:");
        cheque2 = scanner.nextDouble();

        double cpmf1 = (cheque1 * 0.38) / 100;
        double cpmf2 = (cheque2 * 0.38) / 100;
        double saldo = salario - cheque1 - cheque2 - cpmf1 - cpmf2;

        System.out.println("O valor do saldo do funcionário após a emissão dos cheques é =" +saldo);
    }
}

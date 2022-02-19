package com.company;
import java.util.Scanner;
public class Exercicio22 {
    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        double salario_fixo;
        double vendas;

        System.out.println("Digite o salário fixo do funcionário");
        salario_fixo = scanner.nextDouble();
        System.out.println("Digite o valor das vendas do funcionário");
        vendas = scanner.nextDouble();

        double comissao = (vendas * 4) / 100;
        System.out.println("A comissão de vendas é =" +comissao);

        double salario_final = comissao + salario_fixo;
        System.out.println("O salário final é = "+salario_final);
    }
}
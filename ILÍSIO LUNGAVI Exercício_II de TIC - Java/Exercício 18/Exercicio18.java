package com.company;
import java.util.Scanner;
public class Exercicio18 {
    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        double produto;
        double novo_preco;
        double desconto = 0.10;

        System.out.println("Digite o preço do produto:");
        produto = scanner.nextDouble();

        novo_preco = produto - (produto * desconto);
        System.out.println("O novo preço com percentual de desconto é ="+novo_preco);
    }
}

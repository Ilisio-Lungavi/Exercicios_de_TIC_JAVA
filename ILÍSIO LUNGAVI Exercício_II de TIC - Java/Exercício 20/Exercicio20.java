package com.company;
import java.util.Scanner;
public class Exercicio20 {
    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        float custo;
        float convite;
        double quat_convite;

        System.out.println("Digite o Valor do custo do espetáculo teatral:");
        custo = scanner.nextFloat();
        System.out.println("Digite o Valor do preço do espetáculo teatral:");
        convite = scanner.nextFloat();

        quat_convite = custo / convite;

        System.out.println("A quantidade de convites que têm que ser vendidos para alcançar o custo do espetáculo é ="+quat_convite);
    }
}
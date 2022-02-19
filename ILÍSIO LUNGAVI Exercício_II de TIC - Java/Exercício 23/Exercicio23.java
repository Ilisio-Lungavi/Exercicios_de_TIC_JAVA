package com.company;
import java.util.Scanner;
public class Exercicio23 {
    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        float peso;
        float Novo_Peso_Engordar;
        float Novo_Peso_Emagrecer;

        System.out.println("Digite o peso:");
        peso = scanner.nextFloat();

        Novo_Peso_Emagrecer = peso - ((peso * 15) /100);
        System.out.println("A pessoa emagreceu 15% do seu peso:"+ Novo_Peso_Emagrecer);

        Novo_Peso_Engordar = peso + ((peso * 20) /100);
        System.out.println("A pessoa engordou 20% do seu peso:"+ Novo_Peso_Engordar);
    }
}
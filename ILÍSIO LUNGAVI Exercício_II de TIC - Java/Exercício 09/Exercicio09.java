package com.company;
import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args) {

        float peso;
        float gramas;
        float A;

        Scanner scanner;

        scanner = new Scanner(System.in);
        System.out.println("Digite o peso da pessoa:");
        peso = scanner.nextFloat();

         gramas = peso * 1000;

        System.out.println("O peso da pessoa em gramas é =" +gramas);
    }
}

package com.company;
import java.util.Scanner;
public class Exercicio16 {
    public static void main(String[] args) {

        float valor;

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Digite o Valor que se pretende converter:");
        valor = scanner.nextFloat();

        float polegadas = valor * 12;
        float jarda = valor * 3;
        float milha = valor * 1760;

        System.out.println("O valor convertido em polegadas é = "+polegadas);
        System.out.println("O valor convertido em jarda é = "+jarda);
        System.out.println("O valor convertido em milha é = "+milha);

    }
}

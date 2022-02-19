package com.company;
import java.util.Scanner;
public class Exercicio26 {
    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        float num;

        System.out.println("Digite o número: ");
        num=scanner.nextFloat();

        float quadrado = num * num;
        float cubo = num * num * num;

        float raiz = (float)Math.sqrt(num);
        float cubica = (float)Math.pow(num,(1.0/3.0));

        System.out.printf("AO QUADRADO %.2f \n",quadrado);
        System.out.printf("AO CUBO %.2f \n",cubo);
        System.out.printf("A RAIZ %.2f \n",raiz);
        System.out.printf("A RAIZ CUBICA %.2f \n",cubica);
    }
}
package com.company;
import java.util.Scanner;
public class Exercicio30 {
    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        float Peso_Saco_Racao;
        float Racao_Por_Gato;
        float Quant_R = 0;

        System.out.println("Digite o peso do saco de ração:");
        Peso_Saco_Racao = scanner.nextFloat();

        System.out.println("Digite a quantidade de ração para cada gato:");
        Racao_Por_Gato = scanner.nextFloat();

            Quant_R = Peso_Saco_Racao - ((Racao_Por_Gato * 2 * 5) / 1000);

        System.out.println("Apos cinco dias restara " +Quant_R+ "kg de ração");

    }
}
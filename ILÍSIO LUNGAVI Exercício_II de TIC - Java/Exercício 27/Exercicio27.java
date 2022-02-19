package com.company;
import java.util.Scanner;
public class Exercicio27 {
    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        Double Preco_Fabrica;
        Double Preco_Final;
        Double Percentual_Lucro_Distribuidor;
        Double Percentual_Impostos ;
        Double Valor_Distribuidor;
        Double Valor_Impostos = 0.0;

        System.out.println("Digite o Custo de Fábrica de um Carro Novo: ");
        Preco_Fabrica = scanner.nextDouble();

        System.out.println("Digite o Percentual de Lucro do Distribuidor: ");
        Percentual_Lucro_Distribuidor = scanner.nextDouble();

        System.out.println("Digite o Percentula de Imposto: ");
        Percentual_Impostos = scanner.nextDouble();

        Percentual_Impostos = (Preco_Fabrica * Percentual_Impostos) / 100;
        System.out.println("O Valor correspondente ao percentual de imposto é = " + Percentual_Impostos);

        Valor_Distribuidor = ((Preco_Fabrica + Percentual_Impostos) * Percentual_Lucro_Distribuidor) / 100.000;
        System.out.println("O Valor correspondente ao lucro do distribuidor é = " + Valor_Distribuidor);

        Preco_Final = Valor_Distribuidor + Valor_Impostos + Preco_Fabrica;
        System.out.println("O preço final do carro novo é = " + Preco_Final);
    }
}
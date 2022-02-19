package com.company;
import java.util.Scanner;
public class Exercicio31 {
    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println ("Digite o salário Minimo:");
        double Salario_Min  = scanner.nextDouble ();

        System.out.println ("Digite  consumo de quilowatt da residencia:");
        double Consumo_Kw = scanner.nextDouble ();

        double Valor_Pago_kw = Salario_Min / 500;
        double Valor_Total = Valor_Pago_kw * Consumo_Kw;
        double Desconto = Valor_Total- (Valor_Total * 15) / 100;

        System.out.println ("De acordo com seu salário, cada quilowatt consumido custará: $" + Valor_Pago_kw);
        System.out.println ("O valor da sua conta será: $" + Valor_Total + ". Tendo em vista seu consumo de $" + Consumo_Kw);
        System.out.println ("Com o desconto de 15%, o valor a ser pago será de: $" + Desconto);
    }
}

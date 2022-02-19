package com.company;
import java.util.Scanner;
public class Exercicio28 {
    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

        float Num_horas_trab=1;
        float Novo_salario;

        System.out.println("Digite o número de horas trabalhadas:");
        float HT = scanner.nextFloat();

        System.out.println("Digite o salário minímo:");
        float Salario_minimo = scanner.nextFloat();

        float VALOR_HT = Salario_minimo / 2 ;
        System.out.println("a) A hora trabalhada vale a metade do salário mínimo, Que e ="+HT);

        float Salario_bruto = VALOR_HT * HT;
        System.out.println("b) O salário bruto equivalente ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada que e ="+Salario_bruto);

        float imposto = (Salario_bruto * 3) / 100 ;
        System.out.println("c) O imposto equivale a 3% do salário bruto., Que e ="+imposto);

        Novo_salario = Salario_bruto - imposto;
        System.out.println("d) O salário a receber o equivalente ao salário bruto menos o imposto., Que e ="+Novo_salario);

    }
}

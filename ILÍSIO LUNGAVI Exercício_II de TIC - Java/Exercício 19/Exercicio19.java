package com.company;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Exercicio19 {
    public static void main(String[] args) {

        Scanner scanner;
        scanner = new Scanner(System.in);

                double salario;
                double novo_salario;
                double aumento;

                System.out.println("Digite o valor Salário:");
                salario = scanner.nextDouble();
                System.out.println("Digite o valor do percentual de aumento:");
                aumento = scanner.nextDouble();

                aumento = (double)(salario * aumento / 100);
                novo_salario = aumento + salario;
                System.out.println("Seu aumento foi de,R$ "+aumento+" e seu novo salario e :R$"+ novo_salario);
    }
}
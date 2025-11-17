package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salarioMinimo = 1293.20;

        System.out.println("Salário minimo = R$" + salarioMinimo);
        System.out.print("Informe o seu salário: ");
        double salarioUsuario = sc.nextDouble();

        double quantsalario = salarioUsuario / salarioMinimo;

        System.out.println("Você recebe " + String.format("%.2f", quantsalario) + " salários minimos.");
    }
}
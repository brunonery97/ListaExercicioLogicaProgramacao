package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        double a = sc.nextDouble();
        System.out.print("Informe o valor de B: ");
        double b = sc.nextDouble();
        System.out.print("Informe o valor de C: ");
        double c = sc.nextDouble();

        double soma = a + b;
        System.out.println("A + B = " + soma);
        if (soma > c){
            System.out.println(soma + " é maior que " + c);
        } else {
            System.out.println(soma + " não é maior que " + c);
        }

        sc.close();
    }
}
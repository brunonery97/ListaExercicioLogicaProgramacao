package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu peso(Kg): ");
        double peso = sc.nextDouble();
        System.out.print("Informe sua altura: ");
        double altura = sc.nextDouble();

        // formula para calcular o IMC = peso / (altura * altura)

        double imc = peso / (altura * altura);

        if (imc <= 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal. Parabéns");
        } else if (imc >= 25 && imc <= 29.9)  {
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30 && imc <= 34.9){
            System.out.println("Obesidade grau I");
        } else if (imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade grau II (severa)");
        } else {
            System.out.println("Obesidade grau III (mórbida)");
        }


    }
}
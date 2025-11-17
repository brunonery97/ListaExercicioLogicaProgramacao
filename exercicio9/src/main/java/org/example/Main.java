package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a temperatura em Fahrenheit: ");
        double temFar = sc.nextDouble();

        double temCel = ( 5 * ( temFar - 32) / 9);

        System.out.println("Temperatura em Fahrenheit: " + temFar);
        System.out.println("Temperatura em Celsius: " + String.format("%.2f", temCel));

    }
}
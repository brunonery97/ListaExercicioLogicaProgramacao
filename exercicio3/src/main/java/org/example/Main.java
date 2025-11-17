package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        int num1 = sc.nextInt();
        System.out.print("Informe o segundo valor: ");
        int num2 = sc.nextInt();
        int c = 0;

        if (num1 == num2){
            c = num1 + num2;
            System.out.println("Soma = " + c);
        } else {
            c = num1 * num2;
            System.out.println("Multiplicação = " + c);
        }


        sc.close();

    }
}
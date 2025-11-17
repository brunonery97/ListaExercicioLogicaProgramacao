package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tempo da viagem: ");
        double tempo = sc.nextDouble();
        System.out.print("Informe a Velocidade Média: ");
        double velocidadeMedia = sc.nextDouble();

        double distancia = tempo * velocidadeMedia;
        double quantLitros = distancia / 12;

        System.out.println();
        System.out.println("----RESUMO DA VIAGEM----");
        System.out.println("Tempo gasto: " + tempo + " Horas");
        System.out.println("Velocidade média: " + velocidadeMedia +" Km/h");
        System.out.println("Distancia percorrida: " + distancia + " Km");
        System.out.println("A quantidde de gasolina é de " + quantLitros + " litros.");
    }
}
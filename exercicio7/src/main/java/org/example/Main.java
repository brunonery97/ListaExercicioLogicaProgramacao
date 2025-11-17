package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota = 0.0;
        int quantNota = 4;

        System.out.print("Nome do aluno: ");
        String aluno = sc.nextLine();

        for (  int i = 1; i <= quantNota; i++){
            System.out.print("Informe a " + i + " Nota: ");
            double valor = sc.nextDouble();
            nota += valor;
        }

        double media = nota / quantNota;

        if (media >= 7){
            System.out.println("Aluno " + aluno);
            System.out.println("Média " + media);
            System.out.println("Aluno APROVADO!");
        } else {
            System.out.println("Aluno " + aluno);
            System.out.println("Media " + media);
            System.out.println("Aluno REPROVADO!");
        }



        sc.close();
    }
}
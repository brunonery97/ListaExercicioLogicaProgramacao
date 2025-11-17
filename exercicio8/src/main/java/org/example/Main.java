package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");
        double valorProd = sc.nextDouble();
        System.out.println();

        System.out.println("Escolha a opção de pagamento: ");
        System.out.println(
            "1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto\n" +
            "2 - À Vista no cartão de crédito, recebe 10% de desconto\n" +
            "3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros\n" +
            "4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10% ");
        System.out.print("R: ");
        int opcao = sc.nextInt();

        double valorFinal;
        if (opcao == 1){
            valorFinal = valorProd - (valorProd * 0.15);
            System.out.println("Valor Final do Produto: " + valorFinal);
        } else if (opcao == 2) {
            valorFinal = valorProd - (valorProd * 0.10);
            System.out.println("Valor Final do Produto: " + valorFinal);
        } else if (opcao == 3) {
            System.out.println("Valor Final do Produto: " + valorProd);
        } else if (opcao == 4) {
            valorFinal = valorProd + (valorProd * 0.10);
            System.out.println("Valor Final do Produto: " + valorFinal);
        } else {
            System.out.println("Opção Inválida.");
        }


        sc.close();
    }
}
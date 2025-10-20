package atividade_11;

import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem-vindo ao Armazém Automatizado!");
        System.out.print("Por favor, digite o peso do pacote em kg: ");
        if (sc.hasNextDouble()) {
            double peso = sc.nextDouble();
            if (peso < 10) {
                System.out.println("O pacote é classificado como: Leve");
            } else if (peso >= 10 && peso <= 30) {
                System.out.println("O pacote é classificado como: Médio");
            } else if (peso > 30 && peso <= 60) {
                System.out.println("O pacote é classificado como: Pesado");
            } else { // Cobre o caso de peso > 60
                System.out.println("O pacote é classificado como: Muito Pesado");
            }
        } else {
            System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
        }

    }
}

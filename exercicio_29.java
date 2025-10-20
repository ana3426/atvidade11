package atividade_11;

import java.util.Scanner;

public class exercicio_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número total de itens: ");
        int totalItens = scanner.nextInt();
        System.out.print("Digite o número de itens com defeito: ");
        int itensComDefeito = scanner.nextInt();
        if (totalItens == 0) {
            System.out.println("Não é possível calcular a porcentagem de defeitos com 0 itens.");
            return;
        }
        double porcentagemDefeitos = (double) itensComDefeito / totalItens * 100;
        if (porcentagemDefeitos > 20) {
            System.out.println("Porcentagem de defeitos: " + String.format("%.2f", porcentagemDefeitos) + "%");
            System.out.println("Resultado da inspeção: REPROVADO");
        } else if (porcentagemDefeitos >= 10 && porcentagemDefeitos <= 20) {
            System.out.println("Porcentagem de defeitos: " + String.format("%.2f", porcentagemDefeitos) + "%");
            System.out.println("Resultado da inspeção: RETRABALHO");
        } else {
            System.out.println("Porcentagem de defeitos: " + String.format("%.2f", porcentagemDefeitos) + "%");
            System.out.println("Resultado da inspeção: APROVADO");
        }
    }
}

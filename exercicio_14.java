package atividade_11;

import java.util.Scanner;

public class exercicio_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de itens detectados na esteira:");
        int numeroDeItens = sc.nextInt();
        String velocidade;
        if (numeroDeItens <= 10) {
            velocidade = "Lenta";
        } else if (numeroDeItens > 10 && numeroDeItens <= 50) {
            velocidade = "Média";
        } else {
            velocidade = "Rápida";
        }
        System.out.println("A velocidade da esteira é: " + velocidade);
    }
}

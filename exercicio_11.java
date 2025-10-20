package atividade_11;

import java.util.Scanner;

public class exercicio_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Gerenciamento de Rota do Drone -");
        System.out.print("Digite o nível da bateria (em porcentagem): ");
        int nivelBateria = sc.nextInt();
        if (nivelBateria < 20) {
            System.out.println("Nível de bateria abaixo de 20%. Retorno imediato.");
        } else if (nivelBateria >= 20 && nivelBateria <= 60) {
            System.out.println("Nível de bateria entre 20% e 60%. Rota curta.");
        } else { // Se não for nenhuma das condições anteriores, deve ser > 60%
            System.out.println("Nível de bateria acima de 60%. Rota longa.");
        }
    }
}

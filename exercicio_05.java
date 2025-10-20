package atividade_11;

import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de horas de uso da máquina:");
        int horasDeUso = sc.nextInt();
        if (horasDeUso < 500) {
            System.out.println("Urgência da manutenção: BAIXA.");
        } else if (horasDeUso >= 500 && horasDeUso <= 1000) {
            System.out.println("Urgência da manutenção: MÉDIA.");
        } else {
            System.out.println("Urgência da manutenção: ALTA.");
        }
    }
}

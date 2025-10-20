package atividade_11;

import java.util.Scanner;

public class exercicio_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a porcentagem de tráfego suspeito (0-100):");
        int trafegoSuspeito = sc.nextInt();
        if (trafegoSuspeito > 70) {
            System.out.println("Tráfego suspeito > 70%. BLOQUEAR ACESSO.");
        } else if (trafegoSuspeito >= 30 && trafegoSuspeito <= 70) {
            System.out.println("Tráfego suspeito entre 30% e 70%. ALERTA DE SEGURANÇA.");
        } else {
            System.out.println("Tráfego suspeito < 30%. NÍVEL NORMAL.");
        }
    }
}

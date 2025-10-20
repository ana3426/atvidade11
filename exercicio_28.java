package atividade_11;

import java.util.Scanner;

public class exercicio_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Status da Estrada para o Transporte Autônomo:");
        System.out.println("1 - Bloqueada");
        System.out.println("2 - Trânsito Alto");
        System.out.println("3 - Normal");
        System.out.print("Digite o número correspondente à situação atual: ");
        int status = sc.nextInt();
        if (status == 1) {
            System.out.println("Atenção! Estrada bloqueada. Recalculando rota");
        } else if (status == 2) {
            System.out.println("Trânsito alto detectado. Procurando rota alternativa");
        } else {
            System.out.println("Condições normais. Seguindo rota planejada.");
        }

    }}



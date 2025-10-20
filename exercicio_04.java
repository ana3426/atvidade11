package atividade_11;

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); {
            System.out.println(" Sistema de Controle de Acesso à Fábrica Inteligente ");
            System.out.println("Digite seu cargo (Operador, Supervisor, Engenheiro): ");
            String cargo = sc.nextLine();
            String cargoFormatado = cargo.toLowerCase();
            if (cargoFormatado.equals("operador")) {
                System.out.println("Acesso restrito: Você pode operar máquinas básicas.");
            } else if (cargoFormatado.equals("supervisor")) {
                System.out.println("Acesso parcial: Você pode monitorar a produção e gerenciar operadores.");
            } else if (cargoFormatado.equals("engenheiro")) {
                System.out.println("Acesso total: Você pode configurar sistemas e acessar dados críticos.");
            } else {
                System.out.println("Cargo inválido: Acesso negado.");
    }
}}}

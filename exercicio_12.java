package atividade_11;

import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean crachaValido;
        boolean capaceteSeguranca;
        boolean horarioTurno;
        System.out.println("--- Sistema de Reconhecimento de Acesso ---");
        System.out.print("Crachá válido? (true/false): ");
        crachaValido = sc.nextBoolean();
        System.out.print("Capacete de segurança em uso? (true/false): ");
        capaceteSeguranca = sc.nextBoolean();
        System.out.print("Está no horário de turno? (true/false): ");
        horarioTurno = sc.nextBoolean();
        if (crachaValido && capaceteSeguranca && horarioTurno) {
            System.out.println("\nAcesso concedido! Pode entrar na área restrita.");
        } else {
            System.out.println("\nAcesso negado. Todas as condições devem ser verdadeiras.");
            if (!crachaValido) {
                System.out.println("- Motivo: Crachá inválido.");
            }
            if (!capaceteSeguranca) {
                System.out.println("- Motivo: Falta do capacete de segurança.");
            }
            if (!horarioTurno) {
                System.out.println("- Motivo: Fora do horário de turno.");
        }
    }
}}

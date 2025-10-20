package atividade_11;

import java.util.Scanner;

public class exercicio_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura da máquina em °C:");
        double temperatura = sc.nextDouble();
        System.out.println("Digite a vibração da máquina (0-100%):");
        double vibracao = sc.nextDouble();
        if (temperatura > 90 || vibracao > 80) {
            System.out.println("ALERTA: Condições de emergência detectadas! Desligue a máquina imediatamente.");
        } else {
            System.out.println("Normal: A máquina está operando dentro dos parâmetros de segurança.");
        }
    }
}

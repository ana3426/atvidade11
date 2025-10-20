package atividade_11;

import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sistema de Monitoramento de Temperatura");
        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperatura = sc.nextDouble();
        if (temperatura < 0) {
            System.out.println("ALERTA: CONGELAMENTO DETECTADO!");
        } else if (temperatura >= 0 && temperatura <= 40) {
            System.out.println("STATUS: NORMAL.");
        } else {
            System.out.println("ALERTA: SUPERAQUECIMENTO DETECTADO!");
        }
    }
}

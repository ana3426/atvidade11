package atividade_11;

import java.util.Scanner;

public class exercicio_30 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Digite a temperatura do data center em graus Celsius: ");
        int temperatura = sc.nextInt();
        if (temperatura > 80) {
            System.out.println("ALERTA CRÍTICO: Temperatura acima de 80°C! Desligando servidores.");
        } else if (temperatura >= 60 && temperatura <= 80) {
            System.out.println("ALERTA: Temperatura elevada. Acionando resfriamento extra.");
        } else {
            System.out.println("STATUS: Temperatura normal. Tudo funcionando corretamente.");
        }
    }
}

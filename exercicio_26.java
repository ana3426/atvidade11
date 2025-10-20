package atividade_11;

import java.util.Scanner;

public class exercicio_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); {
            System.out.println("Por favor, digite o percentual de tinta restante no reservatório:");
            double percentualTinta = sc.nextDouble();
            if (percentualTinta < 15) {
                System.out.println("Status: PARAR. Nível de tinta abaixo de 15%.");
            } else if (percentualTinta >= 15 && percentualTinta <= 50) {
                System.out.println("Status: ALERTA. Nível de tinta entre 15% e 50%.");
            } else {
                System.out.println("Status: CONTINUAR. Nível de tinta acima de 50%.");
            }
    }
}}

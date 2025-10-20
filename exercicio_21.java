package atividade_11;

import java.util.Scanner;

public class exercicio_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);{
            System.out.print("Por favor, digite o peso da carga em kg: ");
            double pesoCarga = sc.nextDouble();
            if (pesoCarga < 500) {
                System.out.println("Carga de " + pesoCarga + "kg: PERMITIDO.");
            } else if (pesoCarga >= 500 && pesoCarga <= 1000) {
                System.out.println("Carga de " + pesoCarga + "kg: ALERTA. Carga pesada detectada.");
            } else {
                System.out.println("Carga de " + pesoCarga + "kg: PROIBIDO. Limite de peso excedido.");
            }
        }
    }
}

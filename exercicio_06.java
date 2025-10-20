package atividade_11;

import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a distância do obstáculo (em metros): ");
        double distancia = sc.nextDouble();
        if (distancia < 5) {
            System.out.println("Obstáculo detectado a menos de 5m: FREAR");
        } else if (distancia >= 5 && distancia <= 15) {
            System.out.println("Obstáculo detectado entre 5m e 15m: REDUZIR VELOCIDADE");
        } else {
            System.out.println("Obstáculo detectado acima de 15m: ACELERAR");
        }
        sc.close();
    }
}

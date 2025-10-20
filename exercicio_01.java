package atividade_11;

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("O sensor frontal detectou um obstáculo (1 para sim, 0 para não)?");
        int sensorFrontal = scanner.nextInt();
        System.out.println("O sensor da direita detectou um obstáculo (1 para sim, 0 para não)?");
        int sensorDireita = scanner.nextInt();
        System.out.println("O sensor da esquerda detectou um obstáculo (1 para sim, 0 para não)?");
        int sensorEsquerda = scanner.nextInt();
        if (sensorFrontal == 1) {
            System.out.println("Obstáculo frontal! Desviando para a ESQUERDA ou DIREITA.<><>");
        } else if (sensorDireita == 1 && sensorEsquerda == 0) {
            System.out.println("Obstáculo à direita! Virando para a ESQUERDA.<><>");
        } else if (sensorEsquerda == 1 && sensorDireita == 0) {
            System.out.println("Obstáculo à esquerda! Virando para a DIREITA.<><>");
        } else {
            System.out.println("Nenhum obstáculo! Seguindo em FRENTE.<><>");
        }
    }}

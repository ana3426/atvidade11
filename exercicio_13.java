package atividade_11;

import java.util.Scanner;

public class exercicio_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); {
            System.out.println("Digite a produção por hora:");
            int producaoPorHora = sc.nextInt();
            if (producaoPorHora < 50) {
                System.out.println("Baixo desempenho");
            } else if (producaoPorHora >= 50 && producaoPorHora <= 100) {
                System.out.println("Regular");
                System.out.println("Ótimo");
    }
}}}

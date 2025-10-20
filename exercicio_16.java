package atividade_11;

import java.util.Scanner;

public class exercicio_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o tipo de defeito (visível, microscópico, ausente): ");
        String tipoDefeito = scanner.nextLine();
        if (tipoDefeito.equalsIgnoreCase("visível")) {
            System.out.println("Nível de defeito: ALTO");
        } else if (tipoDefeito.equalsIgnoreCase("microscópico")) {
            System.out.println("Nível de defeito: MÉDIO");
        } else if (tipoDefeito.equalsIgnoreCase("ausente")) {
            System.out.println("Nível de defeito: BAIXO");
        } else {
            System.out.println("Tipo de defeito inválido. Por favor, insira um dos tipos listados.");
        }

    }
}

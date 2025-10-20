package atividade_11;

import java.util.Scanner;

public class exercicio_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do pH: ");
        double valorpH = sc.nextDouble();
        if (valorpH < 7) {
            System.out.println("O pH digitado e acido.");
            System.out.println("O pH digitado e neutro");
        } else {
            System.out.println("O pH digitado e basico");
        }
    }
}

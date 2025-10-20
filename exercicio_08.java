package atividade_11;

import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade restante de filamento em porcentagem (ex: 15):");
        int porcentagem = sc.nextInt();
        if (porcentagem < 20) {
            System.out.println("O filamento está acabando. Troque o material!");
        } else {
            System.out.println("A quantidade de filamento é suficiente. Continue a impressão.");
        }
    }
}

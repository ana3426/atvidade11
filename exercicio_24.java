package atividade_11;

import java.util.Scanner;

public class exercicio_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a quantidade de produtos em estoque: ");
        int quantidade = sc.nextInt();
        if (quantidade < 10) {
            System.out.println("Status: Reabastecer urgente!");
        } else if (quantidade >= 10 && quantidade <= 30) {
            System.out.println("Status: Alerta!");
        } else { // Se não for < 10 e não estiver entre 10 e 30, então é > 30
            System.out.println("Status: Normal");
        }

    }
}

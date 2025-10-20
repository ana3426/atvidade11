package atividade_11;

import java.util.Scanner;

public class exercicio_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a intensidade elétrica em Amperes (A): ");
        int intensidade = sc.nextInt();
        if (intensidade < 100) {
            System.out.println("Intensidade: FRACA (< 100A)");
        } else if (intensidade >= 100 && intensidade <= 200) {
            System.out.println("Intensidade: MÉDIA (100–200A)");
        } else {
            System.out.println("Intensidade: FORTE (> 200A)");
        }

    }
}

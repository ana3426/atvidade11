package atividade_11;

import java.util.Scanner;

public class exercicio_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a hora (formato 24h): ");
        int hora = scanner.nextInt();
        String turno;
        if (hora < 12) {
            turno = "Manhã";
        } else if (hora >= 12 && hora <= 18) {
            turno = "Tarde";
        } else {
            turno = "Noite";
        }
        System.out.println("O turno é: " + turno);
        scanner.close();
    }
}

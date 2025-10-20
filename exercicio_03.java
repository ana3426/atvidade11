package atividade_11;

import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner
        System.out.print("Digite o nível de energia da máquina (0-100%): ");
        int nivelEnergia = sc.nextInt();
        if (nivelEnergia < 30) {
            System.out.println("A máquina está no modo ECONÔMICO."); // Imprimir mensagem para modo econômico
        } else if (nivelEnergia >= 30 && nivelEnergia <= 70) {
            System.out.println("A máquina está no modo NORMAL."); // Imprimir mensagem para modo normal
        } else { // acima de 70%
            System.out.println("A máquina está no modo TURBO.");
        }
    }
}

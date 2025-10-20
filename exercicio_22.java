package atividade_11;

import java.util.Scanner;

public class exercicio_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o índice de partículas:");
        int indiceParticulas = scanner.nextInt();
        String classificacao;
        if (indiceParticulas < 50) {
            classificacao = "Bom";
        } else if (indiceParticulas >= 50 && indiceParticulas <= 100) {
            classificacao = "Moderado";
        } else if (indiceParticulas >= 101 && indiceParticulas <= 200) {
            classificacao = "Ruim";
        } else { // indiceParticulas > 200
            classificacao = "Crítico";
        }
        System.out.println("A qualidade do ar é: " + classificacao);
    }
}

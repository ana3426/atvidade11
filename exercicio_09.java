package atividade_11;

import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o índice de defeito do lote em porcentagem (ex: 5,5): ");
        double indiceDefeito = sc.nextDouble();
        sc.close();
        if (indiceDefeito > 10.0) {
            System.out.println("ALERTA: O índice de defeito do lote é superior a 10%. Acione a equipe de qualidade.");
        } else {
            System.out.println("Lote Aprovado. O índice de defeito está dentro do limite aceitável.");
    }
}}

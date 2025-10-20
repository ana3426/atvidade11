package atividade_11;

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código da peça<<!/nav>> (1:Aprovado, 2:Reprovado, 3:Retrabalho, 4:Análise Manual):");
        int codigo = sc.nextInt();
        String estadoPeca;
        if (codigo == 1) {
            estadoPeca = "Aprovado";
        } else if (codigo == 2) {
            estadoPeca = "Reprovado";
        } else if (codigo == 3) {
            estadoPeca = "Retrabalho";
        } else if (codigo == 4) {
            estadoPeca = "Análise Manual";
        } else {
            estadoPeca = "Código Inválido";
        }
        System.out.println("O estado da peça é: " + estadoPeca);
    }
}

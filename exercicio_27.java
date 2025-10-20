package atividade_11;

import java.util.Scanner;

public class exercicio_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o status da linha de produção:");
        System.out.println("1 - Erro Crítico,2 Erro Moderado, 3 Sem Erro");
        int status = scanner.nextInt();
        if (status == 1) {
            System.out.println("AVISO: Erro crítico detectado!");
            System.out.println("Ação: Parar linha de produção imediatamente.");
        } else if (status == 2) {
            System.out.println("ALERTA: Erro moderado detectado.");
            System.out.println("Ação: Acionar equipe de manutenção.");
        } else if (status == 3) {
            System.out.println("INFO: Nenhum erro detectado.");
            System.out.println("Ação: Continuar produção.");
        } else {
            System.out.println("ERRO: Opção inválida. Digite 1, 2 ou 3.");
        }
    }
}
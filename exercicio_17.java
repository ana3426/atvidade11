package atividade_11;

import java.util.Scanner;

public class exercicio_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Status do Robô A (true para falha, false para sucesso):");
        boolean roboAFalhou = sc.nextBoolean();
        System.out.println("Status do Robô B (true para falha, false para sucesso):");
        boolean roboBFalhou = sc.nextBoolean();
        if (roboAFalhou) {
            if (roboBFalhou) {
                System.out.println("Ambos os robôs falharam. Parando a linha de produção.");
            } else {
                System.out.println("Robô A falhou. Acionando o Robô B.");
            }
        } else {
            System.out.println("Robô A está funcionando. Linha de produção continua.");
        }


    }
}

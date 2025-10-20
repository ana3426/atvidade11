package atividade_11;

import java.util.Scanner;

public class exercicio_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a porcentagem de energia solar disponível (ex: 85.5): ");
        double porcentagemSolar = scanner.nextDouble();
        if (porcentagemSolar > 70) {
            System.out.println("Usar sistema solar: A energia solar disponível é alta.");
        } else if (porcentagemSolar >= 30 && porcentagemSolar <= 70) {
            System.out.println("Usar sistema híbrido: Combinação de solar com a rede elétrica.");
        } else {
            System.out.println("Usar rede elétrica: A energia solar disponível é baixa.");
        }

    }
}

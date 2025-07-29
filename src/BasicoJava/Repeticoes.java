package BasicoJava;

import java.util.Scanner;

/*
 * Estruturas de repetição em Java: for, while e do-while
 *
 * Essas estruturas servem para repetir blocos de código com base em condições.
 * A escolha entre elas depende do controle que você precisa sobre a repetição.
 */

public class Repeticoes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ======================
        // 1. FOR
        // ======================

        /*
         * Melhor opção quando sabemos exatamente quantas vezes repetir.
         * Estrutura: for (início; condição; incremento/decremento)
         */

        System.out.println("Contagem progressiva com for:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("For - Valor atual: " + i);
        }

        // ======================
        // 2. WHILE
        // ======================

        /*
         * Verifica a condição ANTES de executar.
         * Pode nunca executar se a condição já começar falsa.
         * Ideal quando não sabemos quantas repetições serão feitas.
         */

        int contadorWhile = 3;
        System.out.println("\nContagem regressiva com while:");
        while (contadorWhile > 0) {
            System.out.println("While - Valor atual: " + contadorWhile);
            contadorWhile--;
        }

        // ======================
        // 3. DO-WHILE
        // ======================

        /*
         * Executa o bloco pelo menos UMA vez antes de verificar a condição.
         * Ideal quando a primeira execução é obrigatória.
         */

        char resposta;
        do {
            System.out.print("\nDeseja repetir o menu? (s/n): ");
            resposta = sc.next().charAt(0);
        } while (resposta == 's' || resposta == 'S');

        System.out.println("\nFim do programa.");
        sc.close();
    }
}


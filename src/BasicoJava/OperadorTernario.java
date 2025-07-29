package BasicoJava;

import java.util.Scanner;

/*
 * Operador Ternário (condição ? valor_se_verdadeiro : valor_se_falso)
 *
 * É uma forma simplificada de escrever uma estrutura if-else simples.
 * Usado principalmente para atribuir valores com base em uma condição.
 */

public class OperadorTernario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        // Forma tradicional com if-else
        String statusTradicional;
        if (idade >= 18) {
            statusTradicional = "Maior de idade";
        } else {
            statusTradicional = "Menor de idade";
        }

        // Forma reduzida com operador ternário
        String statusTernario = (idade >= 18) ? "Maior de idade" : "Menor de idade";

        System.out.println("\nUsando if-else: " + statusTradicional);
        System.out.println("Usando operador ternário: " + statusTernario);

        sc.close();
    }
}
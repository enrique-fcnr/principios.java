package BasicoJava;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Entrada de int
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt(); // Lê um número inteiro

        // Entrada de double
        System.out.print("Digite seu peso: ");
        double peso = sc.nextDouble(); // Lê um número com casas decimais

        // LIMPAR O BUFFER após nextInt() ou nextDouble()
        sc.nextLine(); // Consome a quebra de linha pendente

        // Entrada de String (linha completa)
        System.out.print("Digite seu nome completo: ");
        String nome = sc.nextLine(); // Lê a linha inteira

        // Entrada de uma palavra (até espaço)
        System.out.print("Digite sua cidade: ");
        String cidade = sc.next(); // Lê até o primeiro espaço

        // Entrada de um caractere
        System.out.print("Digite a letra do seu sexo (M/F): ");
        char sexo = sc.next().charAt(0); // Lê a primeira letra digitada

        // Saída formatada
        System.out.println("\n=== DADOS COLETADOS ===");
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Idade: %d anos%n", idade);
        System.out.printf("Peso: %.1f kg%n", peso);
        System.out.printf("Cidade: %s%n", cidade);
        System.out.printf("Sexo: %c%n", sexo);

        sc.close(); // Sempre feche o scanner!


    }
}

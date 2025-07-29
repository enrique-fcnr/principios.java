package BasicoJava;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args){
        /*
         * Introdução às estruturas condicionais (if, else if, else) em Java.
         * Essas estruturas permitem que o programa tome decisões com base em condições lógicas.
         * São amplamente utilizadas em fluxos de verificação, validações, classificações e controle de lógica.
         */

        // ==========================
        // BLOCO 1 — CONDICIONAIS
        // ==========================
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        System.out.print("Digite sua nota final: ");
        double nota = sc.nextDouble();

        if (nota >= 7.0) {
            System.out.println("✅ Aprovado");
        } else if (nota >= 5.0) {
            System.out.println("⚠️ Recuperação");
        } else {
            System.out.println("❌ Reprovado");
        }


        sc.close();
    }
}

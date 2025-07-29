package BasicoJava;

public class FuncoesString {
    public static void main(String[] args){

        /*
         * Principais funções da classe String em Java
         *
         * A classe String possui diversos métodos úteis para manipular textos.
         * Abaixo estão os mais usados com exemplos simples e práticos.
         */

                String texto = " Java é Poderoso! ";

                // ==========================
                // 1. toLowerCase / toUpperCase
                // ==========================
                System.out.println("Minúsculas: " + texto.toLowerCase());
                System.out.println("Maiúsculas: " + texto.toUpperCase());

                // ==========================
                // 2. trim
                // ==========================
                System.out.println("Com espaços: [" + texto + "]");
                System.out.println("Sem espaços: [" + texto.trim() + "]");

                // ==========================
                // 3. length
                // ==========================
                System.out.println("Número de caracteres: " + texto.length());

                // ==========================
                // 4. charAt
                // ==========================
                System.out.println("Letra na posição 2: " + texto.charAt(2));

                // ==========================
                // 5. indexOf / lastIndexOf
                // ==========================
                System.out.println("Primeiro 'a': " + texto.indexOf('a'));
                System.out.println("Último 'a': " + texto.lastIndexOf('a'));

                // ==========================
                // 6. substring
                // ==========================
                System.out.println("Corte do texto (posição 1 a 6): " + texto.substring(1, 6));

                // ==========================
                // 7. replace
                // ==========================
                System.out.println("Substituindo 'a' por '*': " + texto.replace('a', '*'));

                // ==========================
                // 8. startsWith / endsWith
                // ==========================
                System.out.println("Começa com ' Ja': " + texto.startsWith(" Ja"));
                System.out.println("Termina com '! ': " + texto.endsWith("! "));

                // ==========================
                // 9. equals / equalsIgnoreCase
                // ==========================
                String outro = "java é poderoso!";
                System.out.println("É igual (case-sensitive)? " + texto.equals(outro));
                System.out.println("É igual ignorando maiúsculas/minúsculas? " + texto.trim().equalsIgnoreCase(outro));

                // ==========================
                // 10. split
                // ==========================
                String nomes = "Enrique,Ana,Lucas";
                String[] lista = nomes.split(",");

                System.out.println("\nNomes separados:");
                for (String nome : lista) {
                    System.out.println("- " + nome);
                }
            }
        }

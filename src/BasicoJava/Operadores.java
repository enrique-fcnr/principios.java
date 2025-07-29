package BasicoJava;

public class Operadores {

    public static void main(String[] args){


                // === OPERADORES ARITMÉTICOS ===
                int a = 10;
                int b = 3;

                System.out.println("== BasicoJava.Operadores Aritméticos ==");
                System.out.println("a + b = " + (a + b)); // Soma
                System.out.println("a - b = " + (a - b)); // Subtração
                System.out.println("a * b = " + (a * b)); // Multiplicação
                System.out.println("a / b = " + (a / b)); // Divisão inteira
                System.out.println("a % b = " + (a % b)); // Módulo (resto da divisão)

                // === OPERADORES DE INCREMENTO E DECREMENTO ===
                int x = 5;

                System.out.println("\n== BasicoJava.Operadores de Incremento/Decremento ==");
                System.out.println("Valor inicial de x: " + x);
                System.out.println("x++ (pós-incremento): " + x++); // Mostra e depois incrementa
                System.out.println("Depois do x++: " + x);
                System.out.println("++x (pré-incremento): " + ++x); // Incrementa e depois mostra
                System.out.println("x-- (pós-decremento): " + x--); // Mostra e depois decrementa
                System.out.println("--x (pré-decremento): " + --x); // Decrementa e depois mostra

                // === OPERADORES LÓGICOS ===
                boolean cond1 = true;
                boolean cond2 = false;

                System.out.println("\n== BasicoJava.Operadores Lógicos ==");
                System.out.println("cond1 && cond2 = " + (cond1 && cond2)); // E lógico
                System.out.println("cond1 || cond2 = " + (cond1 || cond2)); // OU lógico
                System.out.println("!cond1 = " + (!cond1)); // Negação

                // Exemplo prático com lógica
                int idadeLogica = 20;
                boolean temCarteira = true;

                boolean podeDirigir = idadeLogica >= 18 && temCarteira;
                System.out.println("\nPode dirigir? " + podeDirigir);

                String nome = "Enrique";
                int idade = 19;
                double saldo = 2590.756;

                // Exemplo de uso
                System.out.printf("Nome: %s%n", nome);                  // %s → String
                System.out.printf("Idade: %d anos%n", idade);           // %d → inteiro
                System.out.printf("Saldo: %.2f reais%n", saldo);        // %.2f → double com 2 casas decimais

                // Outras formatações úteis
                System.out.printf("Saldo bruto: %f%n", saldo);          // %f → double padrão (6 casas decimais)
                System.out.printf("Hexadecimal da idade: %x%n", idade); // %x → número em hexadecimal
                System.out.printf("Letra inicial: %c%n", 'E');          // %c → caractere
                System.out.printf("Porcentagem formatada: %.1f%%%n", 75.6); // %% → imprime o símbolo %

                // Quebra de linha
                System.out.printf("Linha 1%nLinha 2%n");                // %n → nova linha (melhor que \n em compatibilidade)
            }
        }


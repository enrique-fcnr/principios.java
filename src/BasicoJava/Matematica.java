package BasicoJava;

public class Matematica {
    public static void main(String[] args){

        double a = 9;
        double b = -5;
        double c = 2.75;

        // === COMANDOS BÁSICOS ===
        System.out.println("=== Comandos Matemáticos Básicos ===");
        System.out.println("Math.abs(b) = " + Math.abs(b));         // Valor absoluto
        System.out.println("Math.sqrt(a) = " + Math.sqrt(a));       // Raiz quadrada
        System.out.println("Math.pow(a, 2) = " + Math.pow(a, 2));   // Potência (a^2)
        System.out.println("Math.max(a, c) = " + Math.max(a, c));   // Maior valor
        System.out.println("Math.min(a, c) = " + Math.min(a, c));   // Menor valor

        // === ARREDONDAMENTO ===
        System.out.println("\n=== Arredondamento ===");
        System.out.println("Math.round(c) = " + Math.round(c));     // Arredonda para o mais próximo
        System.out.println("Math.floor(c) = " + Math.floor(c));     // Arredonda para baixo
        System.out.println("Math.ceil(c) = " + Math.ceil(c));       // Arredonda para cima

        // === CONSTANTES E FUNÇÕES AVANÇADAS ===
        System.out.println("\n=== Constantes e Funções Avançadas ===");
        System.out.println("Math.PI = " + Math.PI);                 // Constante pi
        System.out.println("Math.E = " + Math.E);                   // Constante e
        System.out.println("Math.sin(90° em rad) = " + Math.sin(Math.toRadians(90))); // Seno
        System.out.println("Math.log(10) = " + Math.log(10));       // Logaritmo natural
        System.out.println("Math.exp(2) = " + Math.exp(2));         // e^2
    }

}

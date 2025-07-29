package BasicoJava;

public class Tipagem {

    public static void main(String[] args){

        // === TIPOS MAIS USADOS ===
        System.out.println("=== Tipos Mais Usados ===");

        // int: números inteiros de -2 bilhões até +2 bilhões
        int idade = 19;
        System.out.println("int idade = " + idade);

        // double: números com ponto flutuante (dupla precisão)
        double salario = 2590.75;
        System.out.println("double salario = " + salario);

        // boolean: verdadeiro ou falso (lógica)
        boolean isMaiorDeIdade = idade >= 18;
        System.out.println("boolean isMaiorDeIdade = " + isMaiorDeIdade);

        // String: não é tipo primitivo, mas amplamente usado
        String nome = "Enrique";
        System.out.println("String nome = " + nome);

        // char: um único caractere
        char genero = 'M';
        System.out.println("char genero = " + genero);

        // float: ponto flutuante (menos preciso que double)
        float altura = 1.75f; // precisa do 'f' no final
        System.out.println("float altura = " + altura);


        // === TIPOS MENOS USADOS ===
        System.out.println("\n=== Tipos Menos Usados ===");

        // long: inteiros muito grandes (acima de 2 bilhões)
        long populacaoMundial = 8000000000L; // precisa do 'L'
        System.out.println("long populacaoMundial = " + populacaoMundial);

        // short: inteiros pequenos (-32.768 até 32.767)
        short temperaturaMinima = -120;
        System.out.println("short temperaturaMinima = " + temperaturaMinima);

        // byte: ainda menor que short (-128 até 127)
        byte nivelBateria = 100;
        System.out.println("byte nivelBateria = " + nivelBateria);

        // Aplicações específicas
        System.out.println("\n=== Aplicações Teóricas ===");
        System.out.println("- Use int para contagem, idade, IDs simples.");
        System.out.println("- Use double/float para cálculos com casas decimais.");
        System.out.println("- Use boolean para condições lógicas.");
        System.out.println("- Use long para dados grandes (ex: milissegundos, população).");
        System.out.println("- Use short/byte apenas em otimizações de memória (IoT, sensores).");
        System.out.println("- Use char para representação de símbolos ou letras únicas.");
    }

}

import java.util.Scanner;

public class Crafting{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome;

        System.out.print("Digite o seu nome: ");
        nome = sc.nextLine();

        System.out.printf("%s, o objetivo desse programa é ser uma biblioteca para consulta de " +
                "informações básicas de Programação Orientada a Objetos, mais especificamente, " +
                "relacionadas à linguagem JAVA.", nome);
    }
}
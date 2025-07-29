package BasicoJava;

import java.util.Scanner;

/*
 * Introdução ao switch-case em Java.
 * Utilizado para simplificar múltiplas verificações de uma mesma variável,
 * especialmente quando lidamos com valores exatos (int, char, String...).
 */

public class SwitchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do dia da semana (1 a 7): ");
        int dia = sc.nextInt();

        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda-feira";
                break;
            case 3:
                nomeDia = "Terça-feira";
                break;
            case 4:
                nomeDia = "Quarta-feira";
                break;
            case 5:
                nomeDia = "Quinta-feira";
                break;
            case 6:
                nomeDia = "Sexta-feira";
                break;
            case 7:
                nomeDia = "Sábado";
                break;
            default:
                nomeDia = "Dia inválido!";
        }

        System.out.println("Dia selecionado: " + nomeDia);

        sc.close();
    }
}

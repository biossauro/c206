package Questao3;

import java.util.Scanner;

/* Leia um valor inteiro maior do que 1 e menor do que 1000 e mostre os números ímpares de 1 até este mesmo valor, inclusive, se for o caso. */

public final class Main {
    public static void main(String[] args) {
        // Cria um novo objeto da classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Cria uma nova variável inteira
        int num = 0;

        // Entrada de dados
        do {
            System.out.print("Inteiro >=1 e <=1000: ");
            num = scanner.nextInt();
        } while (num < 1 || num > 1000);

        // Fecha o scanner
        scanner.close();

        // Imprime os números ímpares de 1 até este valor
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

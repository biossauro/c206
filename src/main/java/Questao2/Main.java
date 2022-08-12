package Questao2;

import java.util.Scanner;

/* Leia 3 valores, representando três notas de um aluno. A seguir, calcule a média do aluno, sabendo que a primeira nota tem peso 2, a segunda tem peso 3 e a terceira tem peso 5. Considere que cada nota pode ir de 0.0 até 10.0, sempre com uma casa decimal. A entrada deverá conter 3 valores com uma casa decimal. Imprima, no fim, a uma mensagem mostrando a média deste mesmo aluno. */

public final class Main {
    static double calculaMediaNotas(float a, float b, float c) {
        // a * 20% + b * 30% + c * 50%
        double media = a * 0.2 + b * 0.3 + c * 0.5;
        return media;
    }

    public static void main(String[] args) {
        // Cria um novo objeto da classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Cria 3 variáveis para armazenar as notas e as inicializa com 0
        float a = 0, b = 0, c = 0;

        for (int i = 1; i <= 3; i++) {
            switch (i) {
                case 1:
                    System.out.print("Nota 1 = ");
                    a = scanner.nextFloat();
                    break;
                case 2:
                    System.out.print("Nota 2 = ");
                    b = scanner.nextFloat();
                    break;
                case 3:
                    System.out.print("Nota 3 = ");
                    c = scanner.nextFloat();
                    break;
                default:
                    break;
            }
        }

        // Fecha o scanner
        scanner.close();

        // Calcula a média das notas
        double media = calculaMediaNotas(a, b, c);

        // Mostra a média das notas
        System.out.println("media = " + media);
    }
}
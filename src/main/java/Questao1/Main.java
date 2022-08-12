package Questao1;

import java.util.Scanner;

/* A fórmula para calcular a área de uma circunferência é: [área = pi * raio ^ 2]. Considerando para este problema que [pi = 3.14], efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por pi. A entrada deverá conter o valor do raio, em ponto flutuante. Para a saída, apresente uma mensagem com a área calculada. */

public final class Main {
    static double calculaAreaCirculo(double raio) {
        return Math.pow(raio, 2) * 3.14;
    }

    public static void main(String[] args) {
        // Avisa o usuário para um inserir um valor
        System.out.print("raio = ");

        // Cria um novo objeto da classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Declara uma nova variável e realiza entrada de dados
        double raio = scanner.nextDouble();

        // Fecha o scanner
        scanner.close();

        // Calcula a área da circunferência
        double area = calculaAreaCirculo(raio);

        // Mostra a area da circunferência
        System.out.println("area = " + area);
    }
}
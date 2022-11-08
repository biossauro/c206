import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public final class Main {
    private final static Scanner scan = new Scanner(System.in);

    public static double getInputDoubleP1() throws InvalidInputException {
        String input = scan.nextLine();
        return Double.parseDouble(input);
    }

    public static double getInputDoubleP2() {
        String input = scan.nextLine();
        if (!isDouble(input)) {
            throw new InvalidInputException("Must be a double number!");
        }
        return Double.parseDouble(input);
    }

    private static boolean isDouble(String str) {
        return str != null && str.matches("[0-9.]+");
    }

    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<String, Double>();
        map.put("A", 1.0);
        map.put("B", 2.0);
        map.put("B", 2.0);



        ArrayList<Poligono> poligonos = new ArrayList<Poligono>();

        try {
            System.out.print("Entre c/ Raio de P1: ");
            double raio_p1 = getInputDoubleP1();
            Poligono p1 = new Circulo(raio_p1);
            poligonos.add(p1);

            System.out.print("Entre c/ Lado de P2: ");
            double lado_p2 = getInputDoubleP2();
            Poligono p2 = new Quadrado(lado_p2);
            poligonos.add(p2);

            int count = 1;
            for (Poligono poligono : poligonos) {
                double area = poligono.calculaArea();
                System.out.println("S(P" + count + ") = " + area);
            }
        } catch (InvalidInputException exception) {
            System.out.println("Please, enter with a double next time...");
        } finally {
            System.out.println("Uma boa noite a todos!");
        }
    }
}
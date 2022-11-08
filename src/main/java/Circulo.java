public class Circulo implements Poligono {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return PI * Math.pow(raio, 2);
    }
}

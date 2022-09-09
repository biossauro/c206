public class Vacalo extends Animal {
    public Vacalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Ih ih ih");
    }

    @Override
    public void correr(int distancia) {
        System.out.print("O cavalo " + nome + " ");
        super.correr(distancia);
    }
}

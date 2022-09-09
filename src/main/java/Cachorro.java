public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }

    @Override
    public void correr(int distancia) {
        System.out.print("O cachorro " + nome + " ");
        super.correr(distancia);
    }
}

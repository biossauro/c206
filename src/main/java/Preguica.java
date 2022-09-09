public class Preguica extends Animal {
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Ai que preguica");
    }

    public void subirEmArvore(String velocidade) {
        System.out.print("A preguica " + nome + " ");
        subirEmArvore();
        System.out.println(" " + velocidade + "!");
    }
}

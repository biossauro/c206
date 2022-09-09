public class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("Som");
    }

    public void correr(int distancia) {
        System.out.println("correu " + distancia + " metros!");
    }

    protected void subirEmArvore() {
        System.out.print("subiu em uma arvore");
    }
}

public class Ladino extends PersonagemDeJogador implements AtacanteFisico {
    private int alcanceArco;
    private int numFlechas;

    public Ladino(String nome, String genero, int nivel, int vida, int alcanceArco, int numFlechas) {
        this.nome = nome;
        this.genero = genero;
        this.nivel = nivel;
        this.vida = vida;
        this.alcanceArco = alcanceArco;
        this.numFlechas = numFlechas;
    }

    public int getNumFlechas() {
        return numFlechas;
    }

    public void addMunicao(int qtd) {
        System.out.println(nome + " coletou " + qtd + " flecha(s)!");
        numFlechas += qtd;
    }

    @Override
    public void ataqueFisico() {
        if (numFlechas > 0) {
            System.out.println(nome + " ataca com o arco de alcance " + alcanceArco + "!");
            numFlechas--;
        } else {
            System.out.println("Acabaram as flechas de " + nome + "!");
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Genero: " + genero);
        System.out.println("Classe: Ladino");
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Alcance do Arco: " + alcanceArco);
        System.out.println("Numero de Flechas: " + numFlechas);
    }
}

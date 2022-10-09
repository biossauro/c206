public class Mago extends PersonagemDeJogador implements AtacanteMagico {
    private String especialidadeElemental;
    private int mana;

    public Mago(String nome, String genero, int nivel, int vida, String especialidadeElemental, int mana) {
        this.nome = nome;
        this.genero = genero;
        this.nivel = nivel;
        this.vida = vida;
        this.especialidadeElemental = especialidadeElemental;
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void recuperaMana(int qtd) {
        System.out.println(nome + " recuperou " + qtd + " de mana!");
        mana += qtd;
    }

    @Override
    public void ataqueMagico() {
        if (mana > 0) {
            System.out.println(nome + " conjura uma magia de " + especialidadeElemental + "!");
            mana--;
        } else {
            System.out.println("Acabou a mana de " + nome + "!");
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Genero: " + genero);
        System.out.println("Classe: Mago");
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Especialidade Elemental: " + especialidadeElemental);
        System.out.println("Mana: " + mana);
    }
}

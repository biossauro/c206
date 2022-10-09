public class Guerreiro extends PersonagemDeJogador implements AtacanteFisico {
    public Guerreiro(String nome, String genero, int nivel, int vida) {
        this.nome = nome;
        this.genero = genero;
        this.nivel = nivel;
        this.vida = vida;
    }

    @Override
    public void ataqueFisico() {
        System.out.println(nome + " ataca com a espada!");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Genero: " + genero);
        System.out.println("Classe: Guerreiro");
        System.out.println("Nivel: " + nivel);
        System.out.println("Vida: " + vida);
    }
}

public abstract class PersonagemDeJogador {
    protected String nome;
    protected String genero;
    protected int nivel;
    protected int vida;

    public String getNome() {
        return nome;
    }

    public abstract void mostrarInfo();
}

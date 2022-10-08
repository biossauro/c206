public class Departamento {
    private String nome;
    private double orcamento;

    public Departamento(String nome, double orcamento) {
        this.nome = nome;
        this.orcamento = orcamento;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome = " + nome);
        System.out.println("Orcamento = " + orcamento);
    }
}

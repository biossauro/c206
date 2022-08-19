public class Departamento {
    /*
    Departamento compõe à empresa, ou seja, é parte integral da empresa. Neste exemplo, uma
    empresa possui vários departamentos e cada departamento só faz parte de uma única empresa.
     */
    public String nome;
    public double orcamento;

    public Departamento(String nome, double orcamento) {
        this.nome = nome;
        this.orcamento = orcamento;
    }

    public void mostrarInformacoes() {
        System.out.println("Departamento: " + nome);
        System.out.println("Orcamento: R$" + orcamento);
    }
}
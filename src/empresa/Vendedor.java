package empresa;

public class Vendedor implements Funcionario {
    private int qtdVendas;
    private final String nome;

    Vendedor(int qtdVendas) {
        this.nome = "Vendedor(a)";
        this.qtdVendas = qtdVendas;
    }

    Vendedor(int qtdVendas, String nome) {
        this.nome = nome;
        this.qtdVendas = qtdVendas;
    }

    @Override
    public void receberSalario() {
        float salario = (float) (1212.00 + qtdVendas * 20);
        System.out.println(nome + " recebe R$" + salario + " mensais.");
    }
}

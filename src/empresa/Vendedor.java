package empresa;

public class Vendedor extends Funcionario {
    private int qtdVendas;

    Vendedor(int qtdVendas, String nome) {
        this.nome = nome;
        this.qtdVendas = qtdVendas;
    }

    Vendedor(int qtdVendas) {
        this.nome = "Vendedor(a)";
        this.qtdVendas = qtdVendas;
    }

    @Override
    public void receberSalario() {
        float salario = (float) (1212.01 + qtdVendas * 20);
        System.out.println(nome + " recebe R$" + salario + " mensais.");
    }
}

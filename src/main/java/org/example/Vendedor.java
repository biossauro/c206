package org.example;

public class Vendedor extends Usuario implements Funcionario {
    public Vendedor(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
    }

    @Override
    public void receberSalario() {
        // Vendedor recebe 1 salário mínimo...
        // Vamos supor que um salário seja R$1.212,00.
        System.out.println(nome + " recebe R$" + 1212.00 + "!");
    }
}

package org.example;

public class Gerente extends Usuario implements Funcionario {
    public Gerente(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
    }

    @Override
    public void receberSalario() {
        // Gerente recebe 3 salários mínimos...
        // Vamos supor que um salário seja R$1.212,00.
        System.out.println(nome + " recebe R$" + 3 * 1212.00 + "!");
    }
}

package org.example;

public abstract class Usuario {

    public Usuario(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    protected String nome;
    protected String cpf;
    protected int idade;

    public void mostrarInfos() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
    }
}

package model.classes;

public class Funcionario {
    private final String nome;
    private final String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String converteInfo() {
        return "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                "--- --- --- --- --- ---";
    }
}

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome = " + nome);
        System.out.println("CPF = " + cpf);
        System.out.println("Salario = R$" + salario);
    }

}

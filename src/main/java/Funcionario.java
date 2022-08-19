public class Funcionario {
    /*
    Funcionário agrega à empresa, ou seja, é parte da empresa, mas não depende dela. Neste exemplo,
    uma empresa possui vários funcionários e cada funcionário só trabalha para uma empresa.
     */
    public String nome;
    public String cpf;
    public double salario;

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void mostrarInformacoes() {
        System.out.println("Funcionario: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salario: R$" + salario);
    }
}
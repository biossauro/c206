import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String cnpj;

    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private int totalFuncionarios;

    private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
    private int totalDepartamentos;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        totalFuncionarios = funcionarios.size();
    }

    public void addDepartamento(String nome, double orcamento) {
        Departamento departamento = new Departamento(nome, orcamento);
        departamentos.add(departamento);
        totalDepartamentos = departamentos.size();
    }

    public void mostrarInformacoes() {
        System.out.println("--- --- --- --- --- ---");
        System.out.println("Nome = " + nome);
        System.out.println("CNPJ = " + cnpj);
        System.out.println("Qtd. Func. = " + totalFuncionarios);
        System.out.println("Qtd. Dept. = " + totalDepartamentos);
    }

    public void listarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println("--- --- --- --- --- ---");
            funcionario.mostrarInformacoes();
        }
    }

    public void listarDepartamentos() {
        for (Departamento departamento : departamentos) {
            System.out.println("--- --- --- --- --- ---");
            departamento.mostrarInformacoes();
        }
    }
}

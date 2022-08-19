public class Empresa {
    public String nome;
    public String cpnj;
    public int totalDepartamentos = 0;
    public int totalFuncionarios = 0;

    public Departamento[] departamentos;    // Composição
    public Funcionario[] funcionarios;      // Agregação


    public Empresa(String nome, String cnpj, int maxDepartamentos, int maxFuncionarios) {
        this.nome = nome;
        this.cpnj = cnpj;
        departamentos = new Departamento[maxDepartamentos];
        funcionarios = new Funcionario[maxFuncionarios];
    }

    public void mostrarInformacoes() {
        System.out.println("Empresa: " + nome);
        System.out.println("CNPJ: " + cpnj);
        System.out.println("Total de Departamentos: " + totalDepartamentos);
        System.out.println("Total de Funcionarios: " + totalFuncionarios);
    }

    public void addDepartamento(String nome, double orcamento) {
        // Na COMPOSIÇÃO, Departamento é criado internamente em Empresa.
        departamentos[totalDepartamentos] = new Departamento(nome, orcamento);
        totalDepartamentos += 1;
    }

    public void addFuncionario(Funcionario funcionario) {
        // Na AGREGAÇÃO, Funcionario é criado externamente. Depois, é referenciado em Empresa.
        funcionarios[totalFuncionarios] = funcionario;
        totalFuncionarios += 1;
    }

    public void listarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario != null) {
                System.out.println("--- --- --- --- --- ---");
                funcionario.mostrarInformacoes();
            }
        }
    }

    public void listarDepartamentos() {
        for (Departamento departamento : departamentos) {
            if (departamento != null) {
                System.out.println("--- --- --- --- --- ---");
                departamento.mostrarInformacoes();
            }
        }
    }
}
public final class Main {
    public static void main(String[] args) {
        Cliente cl1 = new Cliente("Yoshi");

        Funcionario func1 = new Funcionario("Mario", "123.456.789-10", 1981.07);
        Funcionario func2 = new Funcionario("Luigi", "987.654.321-00", 1983.07);

        Empresa emp1 = new Empresa("Mario Bros", "10.012.345/6789-01", 10, 100);

        emp1.addFuncionario(func1);
        emp1.addFuncionario(func2);

        emp1.addDepartamento("RH", 2999.99);
        emp1.addDepartamento("Tesouraria", 4999.99);

        System.out.println("Dados da Empresa\n--- --- --- --- --- ---");
        emp1.mostrarInformacoes();

        System.out.println("\nDados dos Funcionarios");
        emp1.listarFuncionarios();

        System.out.println("\nDados dos Departamentos");
        emp1.listarDepartamentos();

        System.out.println("\nContratacao de Servico (Cliente)");
        cl1.contratarServico(emp1);
    }
}
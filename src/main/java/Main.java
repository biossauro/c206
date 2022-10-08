public class Main {
    public static void main(String[] args) {
        Empresa inatel = new Empresa("Inatel", "XX. XXX. XXX/0001-XX");

        Funcionario professor = new Funcionario("Fulano", "123.456.789-01", 6543.21);
        Funcionario monitor = new Funcionario("Beltrano", "987.654.321-02", 543.21);

        inatel.addFuncionario(professor);
        inatel.addFuncionario(monitor);
        inatel.addDepartamento("RH", 52137.99);

        System.out.println("\nDados do Inatel");
        inatel.mostrarInformacoes();

        System.out.println("\nDados dos Funcionarios");
        inatel.listarFuncionarios();

        System.out.println("\nDados dos Departamentos");
        inatel.listarDepartamentos();
    }
}

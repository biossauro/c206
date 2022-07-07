package empresa;

import java.util.Arrays;
import java.util.List;

public class Empresa {
    public static void listarFuncionarios(List<Funcionario> funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            funcionario.receberSalario();
        }
    }

    public static void main(String[] args) {
        Gerente gerente = new Gerente(10);
        Vendedor vendedor = new Vendedor(7);
        Vendedor vendedora = new Vendedor(9, "Roberta");
        List<Funcionario> funcionarios = Arrays.asList(gerente, vendedor, vendedora);
        listarFuncionarios(funcionarios);
    }
}


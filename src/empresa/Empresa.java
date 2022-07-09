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
        Gerente g1 = new Gerente(10, "Menino Ney");
        Vendedor v1 = new Vendedor(7, "Rainha Elizabeth");
        Vendedor v2 = new Vendedor(5);
        List<Funcionario> funcionarios = Arrays.asList(g1, v1, v2);
        listarFuncionarios(funcionarios);
    }
}


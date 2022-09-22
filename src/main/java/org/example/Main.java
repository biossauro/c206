package org.example;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Zezinho", "123.456.789-10", 19);
        Vendedor v1 = new Vendedor("Sergio Maluco", "987.654.321-00", 89);
        Gerente g1 = new Gerente("Roberto Justus", "018.691.799-61", 53);

        Usuario[] usuarios = {c1, v1, g1};

        for (Usuario usuario : usuarios) {
            if (usuario != null) {
                usuario.mostrarInfos();
                if (usuario instanceof Funcionario) {
                    ((Funcionario) usuario).receberSalario();
                }
                System.out.println("--- --- --- --- --- ---");
            }
        }
    }
}
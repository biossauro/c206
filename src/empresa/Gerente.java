package empresa;

public class Gerente implements Funcionario {
    private int anosExperiencia;

    Gerente(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public void receberSalario() {
        float salario = (float) (3636.00 + anosExperiencia * 100);
        System.out.println("Gerente recebe R$" + salario + " mensais.");
    }
}
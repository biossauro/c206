package empresa;

public class Gerente extends Funcionario {
    private int anosExperiencia;

    Gerente(int anosExperiencia, String nome) {
        this.nome = nome;
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public void receberSalario() {
        float salario = (float) (3636.03 + anosExperiencia * 100);
        System.out.println(nome + " recebe R$" + salario + " mensais.");
    }
}
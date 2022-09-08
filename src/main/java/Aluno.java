public class Aluno {
    private final String nome;
    private String curso;
    private int periodo;
    private final int matricula;
    private final Disciplina[] disciplinas;
    private int totalDisciplinas = 0;

    public Aluno(String nome, String curso, int periodo, int matricula, int qtdDisciplinas) {
        this.nome = nome;
        this.curso = curso;
        this.periodo = periodo;
        this.matricula = matricula;
        this.disciplinas = new Disciplina[qtdDisciplinas];
    }

    public void addDisciplina(Disciplina disciplina) {
        disciplinas[totalDisciplinas] = disciplina;
        totalDisciplinas++;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void incrementaPeriodo(int n) {
        periodo = +n;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }
}

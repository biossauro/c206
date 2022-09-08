import java.util.Scanner;

public final class Main {
    public static void main(String[] args) {
        Disciplina[] disciplinas = new Disciplina[100];
        Aluno[] alunos = new Aluno[100];
        int totalDisciplinas = 0;
        int totalAlunos = 0;

        Scanner scanner = new Scanner(System.in);
        int operacao;

        do {
            System.out.println("0 - Sair");
            System.out.println("1 - Novo Aluno");
            System.out.println("2 - Nova Disciplina");
            System.out.println("3 - Matricular Aluno em Disciplina");
            System.out.print("Operacao = ");
            operacao = scanner.nextInt();
            switch (operacao) {
                case 0 -> System.out.println("Saindo...");
                case 1 -> {
                    System.out.print("\n");
                    // Nome
                    System.out.print("Nome = ");
                    scanner.nextLine();
                    String nome = scanner.nextLine();
                    // Curso
                    System.out.print("Curso = ");
                    String curso = scanner.nextLine();
                    // Período
                    System.out.print("Periodo = ");
                    int periodo = scanner.nextInt();
                    // Matrícula
                    System.out.print("Matricula = ");
                    int matricula = scanner.nextInt();
                    // Qtd. de Disciplinas
                    System.out.print("Qtd. de Disciplinas = ");
                    int qtdDisciplinas = scanner.nextInt();
                    // Criação de Aluno
                    Aluno aluno = new Aluno(nome, curso, periodo, matricula, qtdDisciplinas);
                    alunos[totalAlunos] = aluno;
                    totalAlunos++;
                    System.out.println("Aluno cadastrado com sucesso!");
                }
                case 2 -> {
                    System.out.print("\n");
                    // Nome
                    System.out.print("Nome = ");
                    scanner.nextLine();
                    String nome = scanner.nextLine();
                    // Sigla
                    System.out.print("Sigla = ");
                    String sigla = scanner.nextLine();
                    // Carga Horária
                    System.out.print("Carga Horaria = ");
                    int cargaHoraria = scanner.nextInt();
                    // Criação de Disciplina
                    Disciplina disciplina = new Disciplina(nome, sigla, cargaHoraria);
                    disciplinas[totalDisciplinas] = disciplina;
                    totalDisciplinas++;
                    System.out.println("Disciplina cadastrada com sucesso!");
                }
                case 3 -> {
                    System.out.print("\n");
                    // Matrícula do Aluno
                    System.out.print("Matricula do Aluno = ");
                    int matricula = scanner.nextInt();
                    // Sigla da Disciplina
                    System.out.print("Sigla da Disciplina = ");
                    scanner.nextLine();
                    String sigla = scanner.nextLine();
                    // Matrícula do Aluno
                    boolean aux = false;
                    for (Disciplina disciplina : disciplinas) {
                        if (disciplina != null && disciplina.getSigla().equals(sigla)) {
                            for (Aluno aluno : alunos) {
                                if (aluno != null && aluno.getMatricula() == matricula) {
                                    aluno.addDisciplina(disciplina);
                                    System.out.println("Aluno matriculado com sucesso!");
                                    aux = true;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    if (!aux) {
                        System.out.println("Aluno ou Disciplina nao encontrados!");
                    }
                }
                default -> System.out.println("Operação inválida!");
            }
            System.out.print("\n");
        } while (operacao != 0);

        System.out.println("------------ ALUNOS E DISCIPLINAS ---------\n");

        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.println("Aluno: " + aluno.getNome());
                System.out.println("Curso: " + aluno.getCurso());
                System.out.println("Periodo: " + aluno.getPeriodo());
                System.out.println("Matricula: " + aluno.getMatricula());
                System.out.println("Disciplinas: ");
                for (Disciplina disciplina : aluno.getDisciplinas()) {
                    if (disciplina != null) {
                        System.out.println("\tNome: " + disciplina.getNome());
                        System.out.println("\tSigla: " + disciplina.getSigla());
                        System.out.println("\tCarga Horaria: " + disciplina.getCargaHoraria());
                        System.out.println("\t...");
                    }
                }
                System.out.print("\n");
            }
        }

        scanner.close();
    }
}

package view;

import controller.FileManager;
import model.classes.Funcionario;

public class MainView {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Fulano", "123.456.789-01");
        Funcionario f2 = new Funcionario("Beltrano", "987.654.321-02");
        String dados_f1 = f1.converteInfo();
        String dados_f2 = f2.converteInfo();
        FileManager.writeTxt("docs/funcionarios/f1.txt", dados_f1);
        FileManager.writeTxt("docs/funcionarios/f2.txt", dados_f2);
        FileManager.readTxt("docs/funcionarios/f1.txt");
        FileManager.readTxtWithScanner("docs/funcionarios/f2.txt");
        // ...
        System.out.println("Fim do programa! =)");
    }
}
public class Guilda {
    PersonagemDeJogador membros[] = new PersonagemDeJogador[5];

    public void addMembro(PersonagemDeJogador personagem) {
        for (int i = 0; i < membros.length; i++) {
            if (membros[i] == null) {
                membros[i] = personagem;
                System.out.println(membros[i].getNome() + " entrou p/ a guilda!");
                break;
            }
        }
    }

    public void listarMembros() {
        System.out.println("Membros da Guilda");
        for (PersonagemDeJogador membro : membros) {
            if (membro != null) {
                System.out.println("--- --- --- --- --- ---");
                membro.mostrarInfo();
            }
        }
        System.out.print("\n");
    }
}

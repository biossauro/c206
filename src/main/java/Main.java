public class Main {
    public static void main(String[] args) {
        Guerreiro p1 = new Guerreiro("Fulano", "M", 15, 94);
        Ladino p2 = new Ladino("Beltrano", "M", 5, 28, 80, 0);
        Mago p3 = new Mago("Sicrano", "M", 20, 82, "fogo", 0);

        Guilda guilda = new Guilda();

        guilda.addMembro(p1);
        guilda.addMembro(p2);
        guilda.addMembro(p3);

        System.out.print("\n");

        p2.addMunicao(5);
        p3.recuperaMana(3);

        System.out.print("\n");

        guilda.listarMembros();

        p1.ataqueFisico();

        while (p2.getNumFlechas() > 0) {
            p2.ataqueFisico();
        }

        while (p3.getMana() > 0) {
            p3.ataqueMagico();
        }
    }
}

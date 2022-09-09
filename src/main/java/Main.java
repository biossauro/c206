public final class Main {
    public static void main(String[] args) {
        Cachorro snoopDog = new Cachorro("Snoop Dog", 5);
        snoopDog.emitirSom();
        snoopDog.correr(10);

        System.out.println("------------------------");

        Vacalo vacalo = new Vacalo("Bojack", 10);
        vacalo.emitirSom();
        vacalo.correr(20);

        System.out.println("------------------------");

        Preguica sid = new Preguica("Sid", 3);
        sid.emitirSom();
        sid.subirEmArvore("lentamente");
    }
}
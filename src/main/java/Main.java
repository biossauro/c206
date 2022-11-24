public final class Main {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        semaforo.start();
        for (int i = 0; i < 12; i++) {
            System.out.println(semaforo.getCor());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        semaforo.desligar();
    }
}

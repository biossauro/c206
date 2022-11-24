public class Semaforo extends Thread {
    private boolean ligado = true;
    private String cor = "vermelho";

    public void run() {
        try {
            while (ligado) {
                switch (cor) {
                    case "verde" -> Thread.sleep(2000);
                    case "amarelo" -> Thread.sleep(1000);
                    case "vermelho" -> Thread.sleep(3000);
                }
                mudarCor();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private synchronized void mudarCor() {
        switch (cor) {
            case "verde" -> cor = "amarelo";
            case "amarelo" -> cor = "vermelho";
            case "vermelho" -> cor = "verde";
        }
    }

    public String getCor() {
        return cor;
    }

    public void desligar() {
        ligado = false;
    }

}

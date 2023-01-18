public class Exercice2 extends Thread {
    private static int numThread = 0;
    private static int partage = 0;
    private int numero;

    public Exercice2() {
        numero = numThread;
        numThread = numThread + 1;

        System.out.println("Thread numero " + numero + " cree.");
    }

    public void run() {
        System.out.println("Thread numero " + numero + " demarre.");

        int acc = partage;
        acc = acc + 1;
        partage = acc;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            return;
        }

        System.out.println("Thread numero " + numero + " termine.");
    }

    public static void main(String args[]) {
        System.out.println("Programme demarre..");

        for (int i = 0; i < 5; i++) {
            Thread unThread = new Exercice2();
            unThread.start();
        }

        System.out.println("Programme principal termine.");
    }
}
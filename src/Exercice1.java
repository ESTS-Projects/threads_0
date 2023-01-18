public class Exercice1 extends Thread {

    private int nombre_max;

    Exercice1(int nombre_max) {
        this.nombre_max = nombre_max;
    }

    public void run() {
        System.out.println(" Je suis le thread. Mes tâches consistent à compter de 1 à " + this.nombre_max + " "
                + "en faisant une pause de 1 seconde entre chaque valeur");

        int delay = 1000;

        for (int nombre = 1; nombre <= nombre_max; nombre++) {
            System.out.println("Le compteur est à " + nombre + ".");

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                return;
            }
        }

        System.out.println(" Fin du thread ");
    }

    public static void main(String[] args) throws Exception {
        System.out.println(" Début de Main ");

        Exercice1 lecompteur = new Exercice1(5);
        lecompteur.start();
        int n = 0;

        while (lecompteur.isAlive()) {
            System.out.println("en train de compter (n=" + n + ")");
            n = n + 1;

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
        }

        System.out.println(" Fin de Main ");
    }
}

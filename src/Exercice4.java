public class Exercice4 extends Thread {

    int max = 0;
    String name = "";

    Exercice4(String name, int max) {
        this.max = max;
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < this.max; i++) {
            System.out.println(this.name + " : " + (i + 1));

            try {
                int min = 0;
                int max = 5000;
                int delay = (int)(Math.random() * max) + min;
                
                Thread.sleep(delay);
            } catch (InterruptedException e) {
            }
        }

        System.out.println("*** " + this.name + " a fini de compter jusqu'à " + this.max);
    }

    public static void main(String args[]) {
        Exercice4 c1 = new Exercice4("Toto", 3);
        Exercice4 c2 = new Exercice4("Mike", 4);

        c1.start();
        c2.start();
    }
}

public class Exercice5 extends Thread {

    int max = 0;
    String name = "";

    Exercice5(String name, int max) {
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

        System.out.println("*** " + this.name + " a fini de compter jusqu'à " + this.max + " en position " + this.getId());
    }

    public static void main(String args[]) {
        Exercice5 c1 = new Exercice5("Toto", 3);
        Exercice5 c2 = new Exercice5("Mike", 4);
        Exercice5 c3 = new Exercice5("Rudy", 2);

        c1.start();
        c2.start();
        c3.start();
    }
}

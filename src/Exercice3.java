public class Exercice3 implements Runnable {

    public void affiche() {
        for (char a = 'A'; a <= 'Z'; a++) {
            System.out.print(a);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }

        System.out.print("\n");
    }

    public static void main(String args[]) {
        Exercice3 A = new Exercice3();
        A.affiche();
    }

    @Override
    public void run() {
        this.affiche();
    }
}

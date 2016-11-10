/**
 * Created by Denis on 10.11.2016.
 */
public class Auto extends Thread {

    private Parkhaus ph;

    public Auto(String name, Parkhaus ph) {
        super(name);
        this.ph = ph;
        start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                sleep((int) (Math.random() * 5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ph.einfahren();
            System.out.println(getName() + " eingefahren!");
            try {
                sleep((int) (Math.random() * 5000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ph.ausfahren();
            System.out.println(getName() + " ausgefahren!");

        }
    }
}

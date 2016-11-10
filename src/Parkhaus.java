/**
 * Created by Denis on 10.11.2016.
 */
public class Parkhaus {
    private volatile int plaetze=10;

    public synchronized void einfahren() {
        while (plaetze == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.plaetze--;

    }

    public synchronized void ausfahren() {
        this.plaetze++;
        notify();
    }

    public int getPlaetze() {
        return plaetze;
    }
}

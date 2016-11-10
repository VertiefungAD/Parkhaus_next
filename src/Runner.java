/**
 * Created by Denis on 10.11.2016.
 */
public class Runner {
    public static void main(String[] args) {
        Parkhaus cg = new Parkhaus();
        for (int i = 0; i < 40; i++) {
            new Auto("Auto" + i, cg);
        }
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(cg.getPlaetze());
        }
    }
}

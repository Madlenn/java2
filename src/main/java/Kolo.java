import java.util.Random;

public class Kolo {


    public double poleKola(double promien) {
        double poleKola = Math.pow(promien, 2) * Math.PI;
        return poleKola;
    }

    public double pole(double promien, int iloscProbek) {
        double pole, poleKwadrat, x, y;
        int k=0;
        Random generator = new Random();


        for (int i = 1; i <= iloscProbek + 1; i++) {
            x = generator.nextDouble() + generator.nextDouble();
            y = generator.nextDouble() + generator.nextDouble();
            if ((Math.pow(x,2) + Math.pow(y,2)) <= Math.pow(promien,2)) {
                k++;
            }
        }

        poleKwadrat = 4 * promien * promien;
        pole = poleKwadrat * k / iloscProbek;


        return pole;
    }

}

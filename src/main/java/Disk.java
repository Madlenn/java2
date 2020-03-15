import java.util.Random;

public class Disk {


    public double areaDisk(double radius) {
        double areaDisk = Math.pow(radius, 2) * Math.PI;
        return areaDisk;
    }

    public double areaMonteCarlo(double radius, int samplesCount) {
        double area, areaSquare, x, y;
        int k=0;
        Random generator = new Random();


        for (int i = 1; i <= samplesCount + 1; i++) {
            x = generator.nextDouble() + generator.nextDouble();
            y = generator.nextDouble() + generator.nextDouble();
            if ((Math.pow(x,2) + Math.pow(y,2)) <= Math.pow(radius,2)) {
                k++;
            }
        }

        areaSquare = 4 * radius * radius;
        area = areaSquare * k / samplesCount;


        return area;
    }

}
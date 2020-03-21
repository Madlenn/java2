import java.util.Random;
import java.util.Scanner;

public class Disk {
    public double radius;
    public Disk(double radius) {
        this.radius = radius;
    }

    public double areaDisk() {
        double areaDisk = Math.pow(radius, 2) * Math.PI;
        return areaDisk;
    }

    public double areaMonteCarlo(int samplesCount) {
        double area, areaSquare, x, y;
        int k = 0;
        Random generator = new Random();

        for (int i = 1; i <= samplesCount + 1; i++) {
            x = generator.nextDouble() + generator.nextDouble();
            y = generator.nextDouble() + generator.nextDouble();
            if ((Math.pow(x, 2) + Math.pow(y, 2)) <= Math.pow(radius, 2)) {
                k++;
            }
        }

        areaSquare = 4 * radius * radius;
        area = areaSquare * k / samplesCount;
        return area;
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        for (int i=0; i<3; i++) {
            Scanner scanner = new Scanner(System.in);
            Disk myDisk = new Disk();

            System.out.println("podaj promień: ");
            double radius = scanner.nextDouble();

            System.out.println("podaj liczbę probek: ");
            int samplesCount = scanner.nextInt();

            double aeraOfDisk = myDisk.areaDisk(radius);
            double aeraOfMonteCarlo = myDisk.areaMonteCarlo(radius, samplesCount);
            System.out.println("pole kola: " + aeraOfDisk + '\n' + "montecarlo " + aeraOfMonteCarlo);
        }



    }
}
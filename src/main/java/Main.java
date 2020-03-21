import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("promień = 8 \n liczba próbek = 100000");
        Disk myDisk3 = new Disk(8);
        double areaOfDisk3 = myDisk3.areaDisk();
        double areaOfMonteCarlo3 = myDisk3.areaMonteCarlo(100000);
        System.out.println("pole koła: " + areaOfDisk3 + '\n' + "montecarlo " + areaOfMonteCarlo3);
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj promień: ");
        double input = scanner.nextDouble();
        Disk myDisk = new Disk(input);
        System.out.println("podaj liczbę probek: ");
        int samplesCount = scanner.nextInt();
        double areaOfDisk = myDisk.areaDisk();
        double areaOfMonteCarlo = myDisk.areaMonteCarlo(samplesCount);
        System.out.println("pole kola: " + areaOfDisk + '\n' + "montecarlo " + areaOfMonteCarlo);

        System.out.println("podaj promień: ");
        double input2 = scanner.nextDouble();
        Disk myDisk2 = new Disk(input2);
        System.out.println("podaj liczbę probek: ");
        int samplesCount2 = scanner.nextInt();
        double areaOfDisk2 = myDisk2.areaDisk();
        double areaOfMonteCarlo2 = myDisk2.areaMonteCarlo(samplesCount2);
        System.out.println("pole kola: " + areaOfDisk2 + '\n' + "montecarlo " + areaOfMonteCarlo2);
    }
}
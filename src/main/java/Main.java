import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj promień: ");
        double input = scanner.nextDouble();
        Disk myDisk = new Disk(input);


        System.out.println("podaj liczbę probek: ");
        int samplesCount = scanner.nextInt();

        double aeraOfDisk = myDisk.areaDisk(input);
        double aeraOfMonteCarlo = myDisk.areaMonteCarlo(input, samplesCount);

        System.out.println("pole kola: " + aeraOfDisk + '\n' + "montecarlo " + aeraOfMonteCarlo);

        System.out.println("podaj promień: ");
        double input2 = scanner.nextDouble();
        Disk myDisk2 = new Disk(input2);
        System.out.println("podaj liczbę probek: ");
        int samplesCount2 = scanner.nextInt();


        double aeraOfDisk2 = myDisk2.areaDisk(input2);
        double aeraOfMonteCarlo2 = myDisk2.areaMonteCarlo(input2, samplesCount2);

        System.out.println("pole kola: " + aeraOfDisk2 + '\n' + "montecarlo " + aeraOfMonteCarlo2);
    }
}
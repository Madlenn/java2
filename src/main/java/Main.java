
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        for (int i=0; i<3; i++)
        {
            Scanner scanner = new Scanner(System.in);
            Kolo myKolo = new Kolo();

            System.out.println("podaj promien: ");
            double promien = scanner.nextDouble();

            System.out.println("podaj ilosc probek: ");
            int iloscProbek = scanner.nextInt();

            double wynik1 = myKolo.poleKola(promien);
            double wynik2 = myKolo.pole(promien, iloscProbek);
            System.out.println("pole kola: " + wynik1 + '\n' + "montecarlo " + wynik2);
        }



    }
}
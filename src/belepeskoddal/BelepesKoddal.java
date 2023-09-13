package belepeskoddal;

import java.util.Scanner;

public class BelepesKoddal {

    private static int pinKod;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Beker();
        Belepes();
        //Kever();
    }

    private static void Beker() {

        System.out.print("kód megadása: ");
        pinKod = sc.nextInt();
        System.out.println("pin elmentve!");
    }

    private static void Belepes() {
        int probalkozas = 1;
        int maxProbalkozas = 3;
        System.out.printf("kérem a belépési kódot (%d/%d): ", probalkozas, maxProbalkozas);
        //probalkozas = 2;
        int beirtKod = sc.nextInt();

        do {
            probalkozas++;
            System.out.printf("kérem a belépési kódot (%d/%d): ", probalkozas, maxProbalkozas);
            beirtKod = sc.nextInt();
        } while (!(beirtKod == pinKod) && probalkozas <= maxProbalkozas-1);
        
        if (probalkozas <= maxProbalkozas && beirtKod == pinKod) {
            System.out.println("Rendben, sikeres belépés!");
        } else {
            System.out.println("Belépés megtagadva!");
        }
    }

}

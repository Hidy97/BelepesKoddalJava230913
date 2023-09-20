package belepeskoddal;

import java.util.Scanner;

public class BelepesKoddal {

    private static int pinKod;
    private static Scanner sc = new Scanner(System.in);
    //private static int beirtKod = sc.nextInt();

    public static void main(String[] args) {
        Beker();
        Belepes();
        // keypad elkészítése, összekeverjük rajta a számokat
        //csak számokat fogadjon el, de akkor a db számot máshogy kell 
        // valueof() int-et tárol stringbe, meg lehet nézni a hosszát
        //Keypad();
        //Kever();
    }

    private static void Beker() {
        /*System.out.print("kód megadása: ");
        pinKod = sc.nextInt();*/
        String pinkodSzoveg = String.valueOf(pinKod);
        //while-ra írd át
        while (pinkodSzoveg.length() < 4 || pinkodSzoveg.length() > 6) {            
            System.out.print("kód megadása: ");
            pinKod = sc.nextInt();
        }
        /*
        do {
            System.out.print("kód megadása: ");
            pinKod = sc.nextInt();
        } while (!(pinkodSzoveg.length() < 4 || pinkodSzoveg.length() > 6));
*/
        System.out.println("pin elmentve!");
    }

    private static void Belepes() {
        int probalkozas = 1;
        int maxProbalkozas = 3;
        System.out.printf("kérem a belépési kódot (%d/%d): ", probalkozas, maxProbalkozas);
        //Létrehoztam globálisan
        int beirtKod = sc.nextInt();

        do {
            System.out.println("Hibás pinkód!");
            System.out.printf("kérem a belépési kódot (%d/%d): ", probalkozas, maxProbalkozas);
            probalkozas++;
            beirtKod = sc.nextInt();
        } while (!(beirtKod == pinKod) && probalkozas <= maxProbalkozas - 1);

        if (probalkozas <= maxProbalkozas && beirtKod == pinKod) {
            System.out.println("Rendben, sikeres belépés!");
        } else {
            System.out.println("Belépés megtagadva!");
        }
    }

}

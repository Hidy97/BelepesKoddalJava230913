package belepeskoddal;

public class NyomGomb {
    private int[] szamok = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public NyomGomb(int[] szamok) {
        this.szamok = szamok;
    }

    public int[] getSzamok(int index) {
        int pinSzam = 0;
        for (int i : szamok) {
            if (index == szamok[i]) {
                pinSzam = szamok[i];
            }
        }
        //return pinSzam;
    }
    
}

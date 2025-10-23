package j7;

public class MainSegitiga {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        System.out.println("--- Menguji Overloading totalSudut ---");
        segitiga.infoSudut(60);
        segitiga.infoSudut(90, 30);

        System.out.println("\n--- Menguji Overloading keliling ---");
        segitiga.infoKeliling(10, 12, 14);
        segitiga.infoKeliling(3, 4);
    }
}
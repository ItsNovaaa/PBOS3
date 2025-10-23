package uts;

public class Padi extends Tanaman {
    public Padi() {
        // super(nama, waktuPanen, kebutuhanAir, kebutuhanPupuk)
        super("Padi", 90, 10, 5);
    }

    @Override
    public void tumbuh() {
        // Implementasi pertumbuhan spesifik untuk Padi
        this.umur++;
        // Setiap beberapa hari, kebutuhan air/pupuk bertambah
        if (this.umur % 20 == 0) {
            this.kebutuhanAir += 2;
            this.kebutuhanPupuk += 1;
        }
        System.out.println("Tanaman Padi bertambah umur.");
    }
}
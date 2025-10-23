package uts;

public class Tomat extends Tanaman {
    public Tomat() {
        // super(nama, waktuPanen, kebutuhanAir, kebutuhanPupuk)
        super("Tomat", 60, 5, 2);
    }

    @Override
    public void tumbuh() {
        this.umur++;
        if (this.umur % 10 == 0) {
            this.kebutuhanAir += 1;
        }
        System.out.println("Tanaman Tomat bertambah umur.");
    }
}
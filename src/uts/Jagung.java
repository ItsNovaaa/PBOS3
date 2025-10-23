package uts;

public class Jagung extends Tanaman {
    public Jagung() {
        // super(nama, waktuPanen, kebutuhanAir, kebutuhanPupuk)
        super("Jagung", 75, 8, 4);
    }

    @Override
    public void tumbuh() {
        this.umur++;
        if (this.umur % 15 == 0) {
            this.kebutuhanAir += 1;
            this.kebutuhanPupuk += 1;
        }
        System.out.println("Tanaman Jagung bertambah umur.");
    }
}
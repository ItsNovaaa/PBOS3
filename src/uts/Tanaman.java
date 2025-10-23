package uts;

public abstract class Tanaman {
    protected String nama;
    protected int umur;
    protected int waktuPanen;
    protected int kebutuhanAir;
    protected int kebutuhanPupuk;
    protected boolean sedangSakit;
    protected boolean sudahPanen;

    public Tanaman(String nama, int waktuPanen, int kebutuhanAir, int kebutuhanPupuk) {
        this.nama = nama;
        this.waktuPanen = waktuPanen;
        this.kebutuhanAir = kebutuhanAir;
        this.kebutuhanPupuk = kebutuhanPupuk;
        this.umur = 0;
        this.sedangSakit = false;
        this.sudahPanen = false;
    }

    // Abstract method (Polimorfisme)
    public abstract void tumbuh();

    public void siram() {
        if (kebutuhanAir > 0) {
            kebutuhanAir--;
            System.out.println(nama + " telah disiram.");
        } else {
            System.out.println(nama + " tidak butuh air tambahan saat ini.");
        }
    }

    public void pupuk() {
        if (kebutuhanPupuk > 0) {
            kebutuhanPupuk--;
            System.out.println(nama + " telah diberi pupuk.");
        } else {
            System.out.println(nama + " tidak butuh pupuk tambahan saat ini.");
        }
    }

    public void panen() {
        if (umur >= waktuPanen && !sudahPanen) {
            this.sudahPanen = true;
            System.out.println(nama + " berhasil dipanen!");
        } else if (sudahPanen) {
             System.out.println(nama + " sudah pernah dipanen.");
        } else {
            System.out.println(nama + " belum siap untuk dipanen.");
        }
    }

    // Getters and Setters
    public String getNama() {
        return nama;
    }

    public boolean isSudahPanen() {
        return sudahPanen;
    }

    public void setSedangSakit(boolean sedangSakit) {
        this.sedangSakit = sedangSakit;
    }

    @Override
    public String toString() {
        return String.format(
            "%s (Umur: %d/%d hari, Air: %d, Pupuk: %d, Sakit: %s, Siap Panen: %s)",
            nama, umur, waktuPanen, kebutuhanAir, kebutuhanPupuk, sedangSakit, (umur >= waktuPanen)
        );
    }
}
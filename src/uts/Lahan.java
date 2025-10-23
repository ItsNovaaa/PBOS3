package uts;

public class Lahan {
    private String jenisTanah;
    private Tanaman tanaman; // Agregasi: Lahan "memiliki" sebuah Tanaman

    public Lahan(String jenisTanah) {
        this.jenisTanah = jenisTanah;
        this.tanaman = null;
    }

    public void tanam(Tanaman t) {
        if (this.tanaman == null) {
            this.tanaman = t;
            System.out.println(t.getNama() + " berhasil ditanam di lahan " + jenisTanah);
        } else {
            System.out.println("Lahan sudah terisi, tidak bisa menanam.");
        }
    }
    
    public void updatePertumbuhan() {
        if (tanaman != null && !tanaman.isSudahPanen()) {
            tanaman.tumbuh();
        }
    }
    
    public Tanaman panen() {
        if (tanaman != null && tanaman.umur >= tanaman.waktuPanen) {
            tanaman.panen();
            Tanaman hasilPanen = this.tanaman;
            this.tanaman = null; // Kosongkan lahan setelah panen
            System.out.println("Lahan kembali kosong.");
            return hasilPanen;
        } else {
            System.out.println("Tidak ada yang bisa dipanen atau tanaman belum siap.");
            return null;
        }
    }

    public Tanaman getTanaman() {
        return tanaman;
    }

    @Override
    public String toString() {
        if (tanaman != null) {
            return "Lahan " + jenisTanah + " ditanami: " + tanaman.toString();
        } else {
            return "Lahan " + jenisTanah + " [Kosong]";
        }
    }
}
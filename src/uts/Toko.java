package uts;

public class Toko {
    // Overloading method beliBibit
    public Tanaman beliBibit(Pemain pemain, String jenisBibit) {
        return beliBibit(pemain, jenisBibit, 1);
    }
    
    public Tanaman beliBibit(Pemain pemain, String jenisBibit, int jumlah) {
        int harga = 0;
        Tanaman bibit = null;

        switch (jenisBibit.toLowerCase()) {
            case "padi":
                harga = 100 * jumlah;
                bibit = new Padi();
                break;
            case "jagung":
                harga = 120 * jumlah;
                bibit = new Jagung();
                break;
            case "tomat":
                harga = 80 * jumlah;
                bibit = new Tomat();
                break;
            default:
                System.out.println("Bibit tidak tersedia.");
                return null;
        }

        if (pemain.kurangiUang(harga)) {
            System.out.println("berhasil membeli bibit " + jenisBibit);
            return bibit; // Untuk simplicity, kita hanya return 1 bibit untuk ditanam
        } else {
            System.out.println("Gagal membeli bibit.");
            return null;
        }
    }

    public void jualHasil(Pemain pemain, Tanaman hasil) {
        int hargaJual = 0;
        if (hasil instanceof Padi) {
            hargaJual = 500;
        } else if (hasil instanceof Jagung) {
            hargaJual = 600;
        } else if (hasil instanceof Tomat) {
            hargaJual = 400;
        }
        
        pemain.tambahUang(hargaJual);
        System.out.println("Berhasil menjual " + hasil.getNama() + " seharga " + hargaJual);
    }
}
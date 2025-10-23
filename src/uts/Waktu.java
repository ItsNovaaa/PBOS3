package uts;

public class Waktu {
    private int hari;

    public Waktu() {
        this.hari = 1;
    }

    public void nextDay(Lahan lahan, Cuaca cuaca) {
        this.hari++;
        System.out.println("\n--- Hari ke-" + this.hari + " ---");
        cuaca.ubahCuaca();
        
        // Pengaruh cuaca
        if (cuaca.getKondisi().equals("Hujan") && lahan.getTanaman() != null) {
            System.out.println("Karena hujan, tanaman tersiram secara alami.");
            lahan.getTanaman().siram();
        }
        
        // Update pertumbuhan tanaman di lahan
        if (lahan != null) {
            lahan.updatePertumbuhan();
        }
    }

    public int getHari() {
        return hari;
    }
}
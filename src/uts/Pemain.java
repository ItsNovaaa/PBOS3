package uts;

import java.util.ArrayList;
import java.util.List;

public class Pemain {
    private String nama;
    private int uang;
    private int energi;
    private List<Tanaman> inventori;

    public Pemain(String nama, int uang, int energi) {
        this.nama = nama;
        this.uang = uang;
        this.energi = energi;
        this.inventori = new ArrayList<>();
    }

    public void tambahUang(int jumlah) {
        this.uang += jumlah;
    }

    public boolean kurangiUang(int jumlah) {
        if (this.uang >= jumlah) {
            this.uang -= jumlah;
            return true;
        } else {
            System.out.println("Uang tidak cukup.");
            return false;
        }
    }

    public void tambahKeInventori(Tanaman hasilPanen) {
        inventori.add(hasilPanen);
        System.out.println(hasilPanen.getNama() + " ditambahkan ke inventori.");
    }
    
    public void lihatStatus() {
        System.out.println("Status Pemain:");
        System.out.println("- Nama: " + nama);
        System.out.println("- Uang: " + uang);
        System.out.println("- Energi: " + energi);
        System.out.println("- Inventori: " + inventori.size() + " hasil panen");
    }
    
    public int getUang() {
        return uang;
    }

    public List<Tanaman> getInventori() {
        return inventori;
    }
}
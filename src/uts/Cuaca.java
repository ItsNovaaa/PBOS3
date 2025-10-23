package uts;

import java.util.Random;

public class Cuaca {
    private String kondisi;
    private int suhu;
    private int kelembaban;

    public Cuaca() {
        ubahCuaca(); // Inisialisasi cuaca secara acak
    }

    public void ubahCuaca() {
        String[] kondisiMungkin = {"Cerah", "Berawan", "Hujan"};
        Random rand = new Random();
        this.kondisi = kondisiMungkin[rand.nextInt(kondisiMungkin.length)];
        this.suhu = 25 + rand.nextInt(10); // Suhu antara 25-34 C
        this.kelembaban = 60 + rand.nextInt(30); // Kelembaban 60-89%
        System.out.println("Cuaca hari ini: " + this.kondisi);
    }

    public String getKondisi() {
        return kondisi;
    }
}
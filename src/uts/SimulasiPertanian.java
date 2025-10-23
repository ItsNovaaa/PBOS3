package uts;

import java.util.Scanner;
import java.util.Random;

public class SimulasiPertanian {

    public static void main(String[] args) {
        // --- Inisialisasi Objek ---
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        Pemain pemain = new Pemain("Petani Java", 2000, 100);
        Lahan lahan = new Lahan("Sawah Belakang Rumah");
        Waktu waktu = new Waktu();
        Cuaca cuaca = new Cuaca();
        Toko toko = new Toko();

        System.out.println("Selamat Datang di Simulasi Pertanian Sederhana!");
        System.out.println("Hari ke-" + waktu.getHari() + ", cuaca: " + cuaca.getKondisi());

        // --- Game Loop ---
        boolean isRunning = true;
        while(isRunning) {
            System.out.println("\n==============================================");
            pemain.lihatStatus();
            System.out.println(lahan.toString());
            System.out.println("==============================================");

            System.out.println("\nPilih Aksi:");
            System.out.println("1. Pergi ke Toko (Beli Bibit)");
            System.out.println("2. Tanam Bibit");
            System.out.println("3. Siram Tanaman");
            System.out.println("4. Beri Pupuk");
            System.out.println("5. Panen");
            System.out.println("6. Jual Hasil Panen");
            System.out.println("7. Lanjut ke Hari Berikutnya");
            System.out.println("0. Keluar dari Game");
            System.out.print("Pilihanmu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Bibit apa yang ingin dibeli? (padi/jagung/tomat): ");
                    String namaBibit = scanner.next();
                    Tanaman bibitBaru = toko.beliBibit(pemain, namaBibit);
                    if (bibitBaru != null && lahan.getTanaman() == null) {
                        lahan.tanam(bibitBaru);
                    } else if (bibitBaru != null) {
                        System.out.println("Bibit disimpan, tanam nanti saat lahan kosong.");
                        // (logic to add to inventory could be added here)
                    }
                    break;
                case 2:
                    System.out.println("Aksi menanam dilakukan setelah membeli bibit dari toko.");
                    break;
                case 3:
                    if (lahan.getTanaman() != null) lahan.getTanaman().siram();
                    else System.out.println("Tidak ada tanaman untuk disiram.");
                    break;
                case 4:
                    if (lahan.getTanaman() != null) lahan.getTanaman().pupuk();
                    else System.out.println("Tidak ada tanaman untuk diberi pupuk.");
                    break;
                case 5:
                    Tanaman hasilPanen = lahan.panen();
                    if (hasilPanen != null) {
                        pemain.tambahKeInventori(hasilPanen);
                    }
                    break;
                case 6:
                     if (!pemain.getInventori().isEmpty()) {
                        toko.jualHasil(pemain, pemain.getInventori().remove(0));
                     } else {
                        System.out.println("Inventori kosong, tidak ada yang bisa dijual.");
                     }
                    break;
                case 7:
                    waktu.nextDay(lahan, cuaca);
                    // Simulasi serangan hama secara acak
                    if (lahan.getTanaman() != null && random.nextInt(100) < 20) { // 20% chance
                        Hama hama; // Polimorfisme
                        if (random.nextBoolean()) {
                            hama = new HamaBelalang();
                        } else {
                            hama = new HamaTikus();
                        }
                        hama.serang(lahan.getTanaman());
                    }
                    break;
                case 0:
                    isRunning = false;
                    System.out.println("Terima kasih telah bermain!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
        scanner.close();
    }
}
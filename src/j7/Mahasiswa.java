package j7;

public class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        System.out.println("Mahasiswa makan seadanya di akhir bulan.");
    }

    public void tidur() {
        System.out.println("Mahasiswa butuh tidur setelah mengerjakan tugas.");
    }
}
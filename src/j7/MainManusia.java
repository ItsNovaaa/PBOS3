package j7;

public class MainManusia {
    public static void main(String[] args) {
        // Membuat objek dari superclass dan subclass
        Manusia manusiaBiasa = new Manusia();
        Dosen dosen = new Dosen();
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("--- Dynamic Method Dispatch ---");
        Manusia m;

        m = manusiaBiasa;
        m.makan(); 

        m = dosen;
        m.makan(); 

        m = mahasiswa;
        m.makan(); 
    }
}

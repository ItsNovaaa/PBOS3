package uts;

public class HamaTikus implements Hama {
    @Override
    public void serang(Tanaman tanaman) {
        System.out.println("Hama tikus menyerang " + tanaman.getNama() + "!");
        tanaman.setSedangSakit(true);
    }
}
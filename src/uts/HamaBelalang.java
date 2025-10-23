package uts;

public class HamaBelalang implements Hama {
    @Override
    public void serang(Tanaman tanaman) {
        System.out.println("Hama belalang menyerang " + tanaman.getNama() + "!");
        tanaman.setSedangSakit(true);
    }
}
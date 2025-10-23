package j7;

public class Perkalian2 {
    void perkalian(int a, int b){
        System.out.println(a * b);
    }
    void perkalian(double a, double b){
        System.out.println(a * b);
    }
    public static void main(String args[]){
        Perkalian2 objek = new Perkalian2();
        objek.perkalian(25, 43);
        objek.perkalian(34.56, 23.7);
    }
}

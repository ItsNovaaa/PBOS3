package j7;

public class Perkalian1 {
    void perkalian(int a, int b){
        System.out.println(a * b);
    }
    void perkalian(int a, int b, int c){
        System.out.println(a * b * c);
    }
    public static void main(String args[]){
        Perkalian1 objek = new Perkalian1();
        objek.perkalian(25, 43);
        objek.perkalian(34, 23, 56);
    }
}

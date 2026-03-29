public class Aritmatika {

    public void hitungPenjumlahan(int a, int b) {
        int nilai = a + b;
        System.out.println("nilai penjumlahan adalah : " + nilai);
        hitungPerkalian(a, b);
    }

    public static void hitungPerkalian(int a, int b) {
        int nilai = a * b;
        System.out.println("nilai perkalian adalah : " + nilai);
        //hitungPenjumlahan(a, b); (error karena memanggil method non-static secara langsung)
    }

    public static void hitungPengurangan(int a, int b) {
        int nilai = a - b;
        System.out.println("nilai pengurangan adalah : " + nilai);
    }

    public double hitungPembagian(String nil1, String nil2) {
        double a = Double.parseDouble(nil1);
        double b = Double.parseDouble(nil2);

        double hasil = a / b;
        return hasil;
    }
}
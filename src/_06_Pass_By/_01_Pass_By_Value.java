package _06_Pass_By;

public class _01_Pass_By_Value {

    public static void main(String[] args) {

        int sayi=10;

        System.out.println("İlk Değer : " + sayi);

        hesapla(sayi);

        System.out.println("Son Değer : " +sayi);
    }

    public static void hesapla(int sayi)
    {
        sayi=1;


    }
}

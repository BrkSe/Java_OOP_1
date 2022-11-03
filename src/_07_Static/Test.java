package _07_Static;

public class Test {

    public static void main(String[] args) {
        Hesapla hesapla=new Hesapla();

        hesapla.sayi1=1;
        hesapla.sayi2=2;

        int topla = hesapla.topla(hesapla.sayi1, hesapla.sayi2);

        int i = Constant.PI * topla;

        System.out.println(i);

        //static değişkenlerin değerleri değişebilir.
        Constant.PI=5;
        int i2 = Constant.PI * topla;
        System.out.println(i2);

       // Constant.DEGER=9;
    }
}

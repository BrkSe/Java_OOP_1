package _09_IS_A_Iliskisi._02_Ornek;

public class Ogrenci extends Kisi{

    private String ogrenciNo;

    public Ogrenci(String ad, String soyad, int yas, String ogrenciNo) {
        super(ad, soyad, yas);
        // SUPER anahtar kelimesi extend edilen sınıfı gösterir.
        this.ogrenciNo = ogrenciNo;
    }



    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }
}

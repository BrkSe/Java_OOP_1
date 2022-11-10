package _11_Ornekler._05_Composition;

public class Test {
    public static void main(String[] args) {

        Ogrenci ogrenci=new Ogrenci("burak","kutbay","123", "111");

        OgrenciIslemleri ogrenciIslemleri=new OgrenciIslemleri(ogrenci);

        ogrenciIslemleri.ekle();
        ogrenciIslemleri.sil();
    }
}

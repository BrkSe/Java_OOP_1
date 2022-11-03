package _04_Kapsulleme;

public class Test {
    public static void main(String[] args) {
        Ogrenci ogrenci=new Ogrenci();

        ogrenci.sabitleAd("Burak");
        ogrenci.setSoyAd("Kutbay");
        ogrenci.setYas(-99);

       // ogrenci.okulNumarasi=-99;

        ogrenci.setOkulNumarasi(-22);


        System.out.println(ogrenci.getAd() + " " + ogrenci.getSoyAd() + " " + ogrenci.getYas() + " " + ogrenci.okulNumarasi);
    }
}

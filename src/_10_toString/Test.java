package _10_toString;

public class Test {
    public static void main(String[] args) {
        Ogrenci ogrenci=new Ogrenci();

        ogrenci.setAd("Burak");
        ogrenci.setSoyad("Kutbay");
        ogrenci.setAdres("Kastamonu");
        ogrenci.setIl("Ankara");
        ogrenci.setOgrenciNumarasi(2);
        ogrenci.setIlce("Merkez");
        ogrenci.setSinifi(1);
        ogrenci.setVeliTelefonNo("111");
        ogrenci.setVeliAdi("alskdjalskdjalsjd");

        //System.out.println(ogrenci.toString());

        Ogrenci ogrenci2=new Ogrenci();


        ogrenci.setAd("Burak");
        ogrenci.setSoyad("Kutbay");
        ogrenci.setAdres("Kastamonu");
        ogrenci.setIl("Ankara");
        ogrenci.setOgrenciNumarasi(2);
        ogrenci.setIlce("Merkez");
        ogrenci.setSinifi(2);
        ogrenci.setVeliTelefonNo("111");
        ogrenci.setVeliAdi("alskdjalskdjalsjd");

        System.out.println(ogrenci.hashCode());
        System.out.println(ogrenci2.hashCode());

        System.out.println(ogrenci.equals(ogrenci2));



    }
}

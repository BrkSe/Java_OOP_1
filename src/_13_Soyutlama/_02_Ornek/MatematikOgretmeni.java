package _13_Soyutlama._02_Ornek;

import _10_toString.Ogrenci;

public class MatematikOgretmeni extends Ogretmen {

    public MatematikOgretmeni(String ad, String soyad, long tcKimlikNo) {
        super(ad, soyad, tcKimlikNo);
    }


    //abstract metot
    @Override
    public void sorumluOlduguSinif() {
        System.out.println("2-A Sınıfından Sorumlu");
    }
}

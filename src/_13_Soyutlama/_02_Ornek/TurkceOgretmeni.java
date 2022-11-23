package _13_Soyutlama._02_Ornek;

public class TurkceOgretmeni extends Ogretmen{


    public TurkceOgretmeni(String ad, String soyad, long tcKimlikNo) {
        super(ad, soyad, tcKimlikNo);
    }

    @Override
    public void sorumluOlduguSinif() {
        System.out.println("2-B Sınıfı");
    }
}

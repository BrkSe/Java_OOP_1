package _13_Soyutlama._02_Ornek;

public abstract class Ogretmen {

    private String ad;
    private String soyad;
    private long tcKimlikNo;

    //govdesiz
    //extend eden override etmek zorunda
    public abstract void sorumluOlduguSinif();

 //   public abstract void maas();

    public Ogretmen(String ad, String soyad, long tcKimlikNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.tcKimlikNo = tcKimlikNo;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", tcKimlikNo=" + tcKimlikNo +
                '}';
    }
}

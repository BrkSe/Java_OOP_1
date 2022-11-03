package _08_Has_A_Iliskisi;

public class Kisi {

    private String ad;
    private int yas;

    //birleştirme compizition, has-a ilişkisi
    private Meslek meslek;

    public Meslek getMeslek() {
        return meslek;
    }

    public void setMeslek(Meslek meslek) {
        this.meslek = meslek;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}

package _05_JavaBean;

import java.io.Serializable;

public class Ogrenci implements Serializable {

    private String ad;
    private String soyad;


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
}

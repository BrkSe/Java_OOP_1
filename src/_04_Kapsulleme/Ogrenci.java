package _04_Kapsulleme;

public class Ogrenci {

    private String ad;
    private String soyAd;
    private int yas;

    public int okulNumarasi;


    public int getOkulNumarasi() {
        return okulNumarasi;
    }

    public void setOkulNumarasi(int okulNumarasi) {
        if (okulNumarasi < 0) {
            okulNumarasi = 0;
        } else {
            this.okulNumarasi = okulNumarasi;

        }
    }

    public String getAd() {
        return ad;
    }

    public void sabitleAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getYas() {
        return yas * 10;
    }

    public void setYas(int yas) {
        if (yas < 0) {
            this.yas = 0;
        } else {
            this.yas = yas;
        }
    }
}

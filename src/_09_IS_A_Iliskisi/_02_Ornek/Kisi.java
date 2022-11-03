package _09_IS_A_Iliskisi._02_Ornek;

public class Kisi {

    private String isim;
    private String soyIsim;
    private int yas;

    public Kisi(String isim, String soyIsim, int yas) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.yas = yas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String yazdir() {
        return " İsmi : " + this.isim + " Soyisim : " + this.soyIsim + " Yaş : " + this.yas;
    }
}

package _11_Ornekler._05_Composition;

public class Ogrenci {

    private String ad;
    private String soyad;
    private String numarasi;
    private String tcKimlik;

    public Ogrenci(String ad, String soyad, String numarasi, String tcKimlik) {
        this.ad = ad;
        this.soyad = soyad;
        this.numarasi = numarasi;
        this.tcKimlik = tcKimlik;
    }

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

    public String getNumarasi() {
        return numarasi;
    }

    public void setNumarasi(String numarasi) {
        this.numarasi = numarasi;
    }

    public String getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(String tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", numarasi='" + numarasi + '\'' +
                ", tcKimlik='" + tcKimlik + '\'' +
                '}';
    }
}

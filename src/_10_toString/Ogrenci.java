package _10_toString;

import java.util.Objects;

public class Ogrenci {
    private String ad;
    private String soyad;
    private int ogrenciNumarasi;
    private long tcKimlikNo;
    private int sinifi;
    private String veliAdi;
    private String veliSoyadi;
    private String veliTelefonNo;
    private String adres;
    private String il;
    private String ilce;
    private String ogretmenAdi;

    @Override
    public String toString() {
        return "Ogrenci Bilgileri{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", ogrenciNumarasi=" + ogrenciNumarasi +
                ", tcKimlikNo=" + tcKimlikNo +
                ", sinifi=" + sinifi +
                ", veliAdi='" + veliAdi + '\'' +
                ", veliSoyadi='" + veliSoyadi + '\'' +
                ", veliTelefonNo='" + veliTelefonNo + '\'' +
                ", adres='" + adres + '\'' +
                ", il='" + il + '\'' +
                ", ilce='" + ilce + '\'' +
                ", ogretmenAdi='" + ogretmenAdi + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ogrenci ogrenci = (Ogrenci) o;

        if (ogrenciNumarasi != ogrenci.ogrenciNumarasi) return false;
        if (tcKimlikNo != ogrenci.tcKimlikNo) return false;
        if (sinifi != ogrenci.sinifi) return false;
        if (!Objects.equals(ad, ogrenci.ad)) return false;
        if (!Objects.equals(soyad, ogrenci.soyad)) return false;
        if (!Objects.equals(veliAdi, ogrenci.veliAdi)) return false;
        if (!Objects.equals(veliSoyadi, ogrenci.veliSoyadi)) return false;
        if (!Objects.equals(veliTelefonNo, ogrenci.veliTelefonNo))
            return false;
        if (!Objects.equals(adres, ogrenci.adres)) return false;
        if (!Objects.equals(il, ogrenci.il)) return false;
        if (!Objects.equals(ilce, ogrenci.ilce)) return false;
        return Objects.equals(ogretmenAdi, ogrenci.ogretmenAdi);
    }

    @Override
    public int hashCode() {
        int result = ad != null ? ad.hashCode() : 0;
        result = 31 * result + (soyad != null ? soyad.hashCode() : 0);
        result = 31 * result + ogrenciNumarasi;
        result = 31 * result + (int) (tcKimlikNo ^ (tcKimlikNo >>> 32));
        result = 31 * result + sinifi;
        result = 31 * result + (veliAdi != null ? veliAdi.hashCode() : 0);
        result = 31 * result + (veliSoyadi != null ? veliSoyadi.hashCode() : 0);
        result = 31 * result + (veliTelefonNo != null ? veliTelefonNo.hashCode() : 0);
        result = 31 * result + (adres != null ? adres.hashCode() : 0);
        result = 31 * result + (il != null ? il.hashCode() : 0);
        result = 31 * result + (ilce != null ? ilce.hashCode() : 0);
        result = 31 * result + (ogretmenAdi != null ? ogretmenAdi.hashCode() : 0);
        return result;
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

    public int getOgrenciNumarasi() {
        return ogrenciNumarasi;
    }

    public void setOgrenciNumarasi(int ogrenciNumarasi) {
        this.ogrenciNumarasi = ogrenciNumarasi;
    }

    public long getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(long tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public int getSinifi() {
        return sinifi;
    }

    public void setSinifi(int sinifi) {
        this.sinifi = sinifi;
    }

    public String getVeliAdi() {
        return veliAdi;
    }

    public void setVeliAdi(String veliAdi) {
        this.veliAdi = veliAdi;
    }

    public String getVeliSoyadi() {
        return veliSoyadi;
    }

    public void setVeliSoyadi(String veliSoyadi) {
        this.veliSoyadi = veliSoyadi;
    }

    public String getVeliTelefonNo() {
        return veliTelefonNo;
    }

    public void setVeliTelefonNo(String veliTelefonNo) {
        this.veliTelefonNo = veliTelefonNo;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getOgretmenAdi() {
        return ogretmenAdi;
    }

    public void setOgretmenAdi(String ogretmenAdi) {
        this.ogretmenAdi = ogretmenAdi;
    }
}

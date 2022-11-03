package _09_IS_A_Iliskisi._01_Ornek;

public class Ogrenci {

    private String isim;

    private String soyisim;

    private int yas;

    private int ogrenciNo;


    public Ogrenci(String isim, String soyisim, int yas, int ogrenciNo) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.ogrenciNo = ogrenciNo;
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String yazdir(){
        return "İsmi : " + this.isim + " Soyisim : " + this.soyisim + " Yaş : " + this.yas + " Ogrenci No : "+ this.ogrenciNo;
     }
}

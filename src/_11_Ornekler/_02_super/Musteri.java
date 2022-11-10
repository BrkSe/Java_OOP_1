package _11_Ornekler._02_super;

public class Musteri extends Kullanici {

    private String sepet;

    public Musteri(String kullaniciAdi, String sifre, String sepet) {
        super(kullaniciAdi, sifre);
        this.sepet = sepet;
    }

    public String getSepet() {
        return sepet;
    }

    public void setSepet(String sepet) {
        this.sepet = sepet;
    }

    public void alisVerisYap(){
        System.out.println("Alış Veriş Yapıldı");
    }
}

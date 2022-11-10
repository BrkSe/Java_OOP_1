package _11_Ornekler._01_Kalitim._02_Ornek;

public class Kullanici {

    private String kullaniciAdi;
    private String sifre;

    public void girisYap(String kullaniciAdi, String sifre){
        if (kullaniciAdi.equals("burak") && sifre.equals("1234")){
            System.out.println("-- Giriş Yapıldı --");
        }else {
            System.out.println("-- Giriş Başarısız --");
        }
    }

    public void mesajGonder(){
        System.out.println("-- Mesaj Gönderildi. --");
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
}

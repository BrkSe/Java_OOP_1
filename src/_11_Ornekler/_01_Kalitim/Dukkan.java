package _11_Ornekler._01_Kalitim;

public class Dukkan {
    private String kullaniciAdi;
    private String sifre;
    private String stok;

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

    public void stokEkle(){
        System.out.println(" Dükkana Stok Eklendi ");
    }


}

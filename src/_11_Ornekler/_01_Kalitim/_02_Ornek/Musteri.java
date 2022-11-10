package _11_Ornekler._01_Kalitim._02_Ornek;

public class Musteri extends Kullanici{

    private String sepet;

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

package _11_Ornekler._01_Kalitim._02_Ornek;

public class Test {
    public static void main(String[] args) {
        Musteri musteri = new Musteri();
        musteri.girisYap("burak", "1234");
        musteri.alisVerisYap();

        Dukkan dukkan = new Dukkan();
        dukkan.girisYap("burak", "1234");
        dukkan.stokEkle();
    }
}

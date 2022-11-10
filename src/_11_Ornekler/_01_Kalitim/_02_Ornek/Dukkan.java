package _11_Ornekler._01_Kalitim._02_Ornek;

public class Dukkan extends Kullanici{
    private String stok;

    public void stokEkle(){
        System.out.println(" Dükkana Stok Eklendi ");
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }
}

package _11_Ornekler._02_super;

public class Dukkan extends Kullanici {
    private String stok;

    public Dukkan(String kullaniciAdi, String sifre, String stok) {
        super(kullaniciAdi, sifre);
        this.stok = stok;
    }

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

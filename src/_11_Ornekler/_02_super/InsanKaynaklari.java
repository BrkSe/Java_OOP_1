package _11_Ornekler._02_super;

public class InsanKaynaklari extends Dukkan{

    private String bolumu;

    public InsanKaynaklari(String kullaniciAdi, String sifre, String stok, String bolumu) {
        super(kullaniciAdi, sifre, stok);
        this.bolumu = bolumu;
    }

    public String getBolumu() {
        return bolumu;
    }

    public void setBolumu(String bolumu) {
        this.bolumu = bolumu;
    }
}

package _13_Soyutlama._01_Ornek;

public class OracleVeritabani extends Veritabani{

    private int maksimum_kayit_sayisi;

    public void OracleParasiniOde(){
        System.out.println("Oracle parası ödendi");
    }

    @Override
    void veritabaniParalosi() {
        System.out.println("Oracle Şifresi");
    }

    @Override
    void veritabaniAdi() {
        System.out.println("Oracle Veritabanı Müşteri Tablosu");
    }

    public int getMaksimum_kayit_sayisi() {
        return maksimum_kayit_sayisi;
    }

    public void setMaksimum_kayit_sayisi(int maksimum_kayit_sayisi) {
        this.maksimum_kayit_sayisi = maksimum_kayit_sayisi;
    }
}

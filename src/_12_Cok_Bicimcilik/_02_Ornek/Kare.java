package _12_Cok_Bicimcilik._02_Ornek;

public class Kare extends Sekil{
    private int uzunluk;

    public Kare(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    @Override
    public int alanHesaplama() {
        return uzunluk*uzunluk;
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }
}

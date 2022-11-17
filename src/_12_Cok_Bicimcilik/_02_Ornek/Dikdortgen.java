package _12_Cok_Bicimcilik._02_Ornek;

public class Dikdortgen extends Sekil {

    private int en;
    private int boy;

    public Dikdortgen(int en, int boy) {
        this.en = en;
        this.boy = boy;
    }

    @Override
    public int alanHesaplama() {
        return en*boy;
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }
}

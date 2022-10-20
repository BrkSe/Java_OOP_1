package _02_Yapilandirici_Metot;

public class Dikdortgen {

    //field , alan, değişken
    public  int en;

    public  int boy;

    public Dikdortgen() {
        this.boy=2;
    }

    public Dikdortgen(int en, int boy){
        this.en=en;
        this.boy=boy;
    }

    public Dikdortgen(int en){
        this.en=en;
        this.boy=19;
    }

    public int alanHesapla(int en, int boy){
       return en*boy;
    }
}

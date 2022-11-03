package _09_IS_A_Iliskisi._02_Ornek;

public class Ogrenci extends Kisi{

    private int ogrenciNo;



    @Override
    public String yazdir() {

        return super.yazdir() + " Öğrenci No: "+ this.getOgrenciNo() ;
    }


    public Ogrenci(String isim, String soyIsim, int yas, int ogrenciNo) {
        super(isim, soyIsim, yas);
        this.ogrenciNo = ogrenciNo;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }
}

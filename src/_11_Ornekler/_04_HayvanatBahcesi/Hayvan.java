package _11_Ornekler._04_HayvanatBahcesi;

public class Hayvan {
    private int id;
    private String isim;
    private int yas;

    public void suVer(){
        System.out.println("Su verildi");
    }

    public void yemekVer(){
        System.out.println("Yemek Verildi");
    }

    public void kontrolEt(){
        System.out.println("Kontrol Edildi");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}

package _11_Ornekler._04_HayvanatBahcesi;

public class Kopek extends Hayvan{
    private int kulakSayisi;

    @Override
    public void kontrolEt() {
        super.kontrolEt();
        System.out.println("Aşı Yapıldı");
    }

    public void gezdir(){
        System.out.println("Köpek Gezdirildi");
    }

    public void egit(){
        System.out.println("Köpek Eğitildi");
    }

}

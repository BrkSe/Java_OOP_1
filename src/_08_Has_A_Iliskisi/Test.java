package _08_Has_A_Iliskisi;



public class Test {

    public static void main(String[] args) {

        Kisi kisi=new Kisi();

        kisi.setAd("Burak");
        kisi.setYas(35);


        Meslek marangoz=new Meslek();

        marangoz.setId(1);
        marangoz.setAdi("Marangozcu");
        marangoz.setUcret(10);

        kisi.setMeslek(marangoz);


        System.out.println(" Adi : " + kisi.getAd() + "Yas : " + kisi.getYas() + " Meslek " + kisi.getMeslek() );



        System.out.println(" Adi : " + kisi.getAd() + "Yas : " + kisi.getYas() + " Meslek " + kisi.getMeslek().getAdi() + " Gun Sayısı : " + kisi.getMeslek().getGunSayisi());


        Kisi kisi2=new Kisi();

        kisi2.setAd("Ali");
        kisi2.setYas(5);
        kisi.setMeslek(null);
        System.out.println("---------------------------------------");
        System.out.println(" Adi : " + kisi2.getAd() + "Yas : " + kisi2.getYas() + " Meslek " + kisi2.getMeslek());
    }
}

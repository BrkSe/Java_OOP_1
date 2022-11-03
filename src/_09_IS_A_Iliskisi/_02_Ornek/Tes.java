package _09_IS_A_Iliskisi._02_Ornek;

public class Tes {
    public static void main(String[] args) {

  //      Kisi personel=new Kisi();

   //     Kisi usta=new Kisi();

        Ogrenci ogrenci=new Ogrenci("Burak", "Kutbay",35,111);

        System.out.println(ogrenci.yazdir());

//        System.out.println(adYazdir() + soyAdYazdir() + " slkajdlaksjdalks");

    }


    public static  String adYazdir(){
        return  "Burak ";
    }


    public static  String soyAdYazdir(){
        return  "Kutbay";
    }
}

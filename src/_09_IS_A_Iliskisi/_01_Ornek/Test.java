package _09_IS_A_Iliskisi._01_Ornek;

public class Test {

    public static void main(String[] args) {

        Ogrenci ogrenci=new Ogrenci("Burak", "KUTBAY", 35, 111);

        System.out.println(ogrenci.yazdir());

        Personel personel=new Personel("Ali", "Veli", 2);

        System.out.println(personel.yazdir());

    }
}

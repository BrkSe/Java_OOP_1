package _01_Sinif_Nese;

//Sınıf
public class Car {

    //nesne değişkenleri
    //bu sınıfın ortak özellikleri
    String ad;

    int hiz;

    double yil;

    String model;

    public void git(String arabadi){
        //local değişknerl
        System.out.println(arabadi +" Gidiyorum");
    }

    public void dur(String arabadi){
        System.out.println(arabadi + " Durdum");

    }
}

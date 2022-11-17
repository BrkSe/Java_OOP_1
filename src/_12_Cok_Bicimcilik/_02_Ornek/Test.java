package _12_Cok_Bicimcilik._02_Ornek;

public class Test {

    public static void main(String[] args) {

        Kare kare=new Kare(6);

        Dikdortgen dikdortgen = new Dikdortgen(5, 7);

      //  kareHesapla(kare);
      //  dikdortgenHesapla(dikdortgen);

 //       hesapla(kare);
        hesapla(dikdortgen);

    }

    public static void hesapla(Sekil sekil){
        System.out.println(sekil.alanHesaplama());

        if (sekil instanceof Kare ){
            System.out.println("Kare hesaplandı");
            System.out.println("Kare işlem 1 ");
        }

        if (sekil instanceof Dikdortgen){
            System.out.println("Dikdörtgen hesaplandı");
            System.out.println("Dikdörtgen işlem 1 ");
        }
    }

    public static void kareHesapla(Kare kare){
        System.out.println("Kare hesaplandı");
        System.out.println(kare.alanHesaplama());
        System.out.println("Kare işlem 1 ");
    }


    public static void dikdortgenHesapla(Dikdortgen dikdortgen){
        System.out.println("Dikdortgen hesaplandı");
        System.out.println(dikdortgen.alanHesaplama());
        System.out.println("Dikdortgen işlem 1 ");
    }
}

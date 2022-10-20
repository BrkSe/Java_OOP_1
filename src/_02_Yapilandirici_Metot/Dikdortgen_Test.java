package _02_Yapilandirici_Metot;

public class Dikdortgen_Test {

    public static void main(String[] args) {


        /**
         * Parametre Almayan Yapılandırıcı Metot
         */

        Dikdortgen dikdortgen = new Dikdortgen();

        dikdortgen.boy = 10;
        dikdortgen.en = 6;

        int sonuc = dikdortgen.alanHesapla(dikdortgen.boy, dikdortgen.en);

        Dikdortgen dikdortgen1=new Dikdortgen();

        System.out.println("BOY" + dikdortgen1.boy + " EN" + dikdortgen1.en );


        dikdortgen1.en=57;
        dikdortgen1.boy=100;


        System.out.println(dikdortgen1.alanHesapla(dikdortgen1.boy, dikdortgen1.en));


        /**
         * Parametre Alan Yapılandırıcı Metot
         */

        Dikdortgen dikdortgen2=new Dikdortgen(8, 10);

        System.out.println(dikdortgen2.alanHesapla(dikdortgen2.boy, dikdortgen2.en));


        Dikdortgen dikdortgen3 = new Dikdortgen();
        System.out.println("Dikdortgen 3 Değerleri : En " + dikdortgen3.en + " Boy : " + dikdortgen3.boy);


        Dikdortgen dikdortgen4 = new Dikdortgen(2, 3);
        System.out.println("Dikdortgen 4 Değerleri : En " + dikdortgen4.en + " Boy : " + dikdortgen4.boy);

        Dikdortgen dikdortgen5 = new Dikdortgen(9);
        System.out.println("Dikdortgen 5 Değerleri : En " + dikdortgen5.en + " Boy : " + dikdortgen5.boy);


        System.out.println(dikdortgen3.alanHesapla(dikdortgen3.boy, dikdortgen3.en));

         deneme();
    }

    public static void deneme() {
    }
}

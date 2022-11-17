package _12_Cok_Bicimcilik._01_Ornek;

public class Test {

    public static void main(String[] args) {

        Hayvan hayvan=new Hayvan();
        hayvan.kos();
        System.out.println("---------------");

        hayvan=new Aslan();
   //     Hayvan hayvan1=new Aslan();
      //  hayvan1.kos();
        hayvan.kos();
        System.out.println("-----------------");

    //   Hayvan hayvan2=new Kopek();
    //    hayvan2.kos();

        hayvan=new Kopek();
        hayvan.kos();
        hayvan.dur();

        ((Kopek) hayvan).sevdir();

    }
}

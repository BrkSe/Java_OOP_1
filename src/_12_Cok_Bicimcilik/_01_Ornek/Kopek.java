package _12_Cok_Bicimcilik._01_Ornek;

public class Kopek extends Hayvan {


    public void sevdir(){
        System.out.println("Köpek kendini sevdirdi.");
    }
    @Override
    public void kos() {
        System.out.println("Köpek daha yavaş koşuyor.");
    }
}

package _11_Ornekler._04_HayvanatBahcesi;

public class Test {
    public static void main(String[] args) {
        Aslan aslan=new Aslan();
        aslan.setYeleUzunlugu(5);
        aslan.setId(1);
        aslan.setIsim("aslan kral");
        aslan.setYas(5);

        Inek inek=new Inek();
        inek.sutSag();
        inek.kontrolEt();

        Kopek kopek=new Kopek();

        kopek.gezdir();
        kopek.egit();
        kopek.kontrolEt();
    }
}

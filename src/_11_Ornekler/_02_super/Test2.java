package _11_Ornekler._02_super;


public class Test2 {
    public static void main(String[] args) {

        HemenYap hemenYap=new HemenYap();
        int i = hemenYap.metot1();
        String s = hemenYap.metot2();
        hemenYap.setCsvAd("list");

        hemenYap.parcala(s, i);

    }
}

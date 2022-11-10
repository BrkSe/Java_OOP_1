package _11_Ornekler._06_BookStore;

public class Test {
    public static void main(String[] args) {
        Kitap alinacakKitap=new Kitap("JAVA", "AHmet", "11", "3434");

        Kitap teslimEdilecekKitap=new Kitap("Pascal", "Mehmet", "555","77");

      // KitapIslemleri alinacakitapIslemleri=new KitapIslemleri();
      // alinacakitapIslemleri.setKitap(alinacakKitap);
      // alinacakitapIslemleri.kirala();

      // System.out.println("---------------------------------");

      // KitapIslemleri teslimEdilecekKitapIslemleri=new KitapIslemleri();
      // teslimEdilecekKitapIslemleri.setKitap(teslimEdilecekKitap);
      // teslimEdilecekKitapIslemleri.teslimAl();

        /////////////////////////////

        KitapIslemleri kitapIslemleri=new KitapIslemleri();
        kitapIslemleri.setKitap(alinacakKitap);
        kitapIslemleri.kirala();

        kitapIslemleri.setKitap(teslimEdilecekKitap);
        kitapIslemleri.teslimAl();

    }
}

package _14_Interface;

public class Satici implements VeriTabaniIslemleri{



    @Override
    public void ekle(int a, int b) {

    }

    @Override
    public boolean sil() {
        System.out.println("Satıcı Silindi");
        return true;
    }

    @Override
    public int guncelle() {
        System.out.println("Satıcı Silindi");
        return 1;
    }

    @Override
    public String yazdir() {
        String yazdir="Satıcı Yazıdırıldı";
        return yazdir;
    }
}

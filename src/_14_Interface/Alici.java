package _14_Interface;

public class Alici implements VeriTabaniIslemleri {


    @Override
    public void ekle(int a, int b) {
        System.out.println("Alıcı Eklendi");
    }

    @Override
    public boolean sil() {
        System.out.println("Alıcı Silindi");
        return true;
    }

    @Override
    public int guncelle() {
        System.out.println("Alıcı Silindi");
        return 1;
    }

    @Override
    public String yazdir() {
        String yazdir="Alıcı Yazıdırıldı";
        return yazdir;
    }
}

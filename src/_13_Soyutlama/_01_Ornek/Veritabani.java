package _13_Soyutlama._01_Ornek;

public abstract class Veritabani {

    //gövdeli metot
    public void ekle(){
        System.out.println("Veritabanına kayıt eklendi");
    }

    //gövdeli metot
    public void sil(){
        System.out.println("Veritabanında kayıt silindi");
    }

    //gövdeli metot
    public void guncelle(){
        System.out.println("Veritabanında kayıt güncellendi");
    }

    //gövdesiz
    abstract void veritabaniParalosi();

    abstract void veritabaniAdi();

}

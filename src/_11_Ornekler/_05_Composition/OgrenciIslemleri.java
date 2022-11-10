package _11_Ornekler._05_Composition;

public class OgrenciIslemleri {


    private Ogrenci ogrenci;

    public OgrenciIslemleri(Ogrenci ogrenci) {
        this.ogrenci = ogrenci;
    }

    //ekle

    public void ekle(){
        System.out.println(ogrenci.getAd() + "isimli öğrenci sisteme eklendi");
    }


    //sil

    public void sil(){
        System.out.println(ogrenci.getNumarasi() + "numaralı öğrenci sistemden silindi");
    }

}

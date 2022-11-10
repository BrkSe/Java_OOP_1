package _11_Ornekler._06_BookStore;

import java.util.LinkedList;

public class KitapIslemleri {

    private String aasdasdas;
    private String bkbkbkb;
    private Kitap kitap;

    private LinkedList<Kitap> kitapLinkedList;


    public void kirala(){
        System.out.println(" Kitap kiralandı : " + kitap.getAdi());
    }

    public void teslimAl(){
        System.out.println(" Kitap teslim alındı : " + kitap.getAdi());
    }

    public Kitap getKitap() {
        return kitap;
    }

    public void setKitap(Kitap kitap) {
        this.kitap = kitap;
    }
}

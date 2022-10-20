package _03_Erisim_Belirliyicler.com.burakkutbay;

public class Musteri {

    /***
     * public: Her yerden erişilir
     * private: Sadece bulunduğu sınıftan sınıftan erişilebilir
     */

    public int id;

    public String adSoyad;

    private String cinsiyet;

    public Musteri(int id, String adSoyad) {
        this.id = id;
        this.adSoyad = adSoyad;
        this.cinsiyet="Erkek";
    }

    public void yazdir(){
        System.out.println("Müşteri id : " + this.id+ " ad soyad  " + this.adSoyad + " Cinsiyet : " + this.cinsiyet);
    }
}

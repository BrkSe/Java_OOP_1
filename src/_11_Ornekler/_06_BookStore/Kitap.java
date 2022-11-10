package _11_Ornekler._06_BookStore;

public class Kitap {
    private String adi;
    private String yazar;
    private String isbn;
    private String yil;

    public Kitap(String adi, String yazar, String isbn, String yil) {
        this.adi = adi;
        this.yazar = yazar;
        this.isbn = isbn;
        this.yil = yil;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getYil() {
        return yil;
    }

    public void setYil(String yil) {
        this.yil = yil;
    }
}

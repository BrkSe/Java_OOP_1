package _13_Soyutlama._01_Ornek;

public class Test {

    public static void main(String[] args) {

        OracleVeritabani oracleVeritabani=new OracleVeritabani();
        oracleVeritabani.veritabaniAdi();
        oracleVeritabani.veritabaniParalosi();
        oracleVeritabani.ekle();

        System.out.println("---------------------");
        MySql mySql=new MySql();
        mySql.veritabaniAdi();
        mySql.guncelle();
        mySql.sil();
    }
}

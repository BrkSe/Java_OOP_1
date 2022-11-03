package _06_Pass_By;

public class _02_Pass_By_Refence {

    int x;



    public static void main(String[] args) {

        _02_Pass_By_Refence pass_by_refence=new _02_Pass_By_Refence();

        pass_by_refence.x=5;

        System.out.println("İlk Değer : " + pass_by_refence.x);

        hesapla(pass_by_refence);

        System.out.println(" Son Değer : " + pass_by_refence.x);
    }

    private static void hesapla(_02_Pass_By_Refence pass_by_refence) {
        pass_by_refence.x=66;
    }


}

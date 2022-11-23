package _13_Soyutlama._02_Ornek;

public class Test {
    public static void main(String[] args) {
        //Abstract sınıflarımızın örneğini oluşturmayız
        //Ogretmen ogretmen = new Ogretmen("Burak", "kutbay", 3234324L);

        MatematikOgretmeni matematikOgretmeni = new MatematikOgretmeni("Burak", "kutbay", 3234324L);
        System.out.println(matematikOgretmeni.toString());
        matematikOgretmeni.sorumluOlduguSinif();
    }
}

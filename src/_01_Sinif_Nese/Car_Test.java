package _01_Sinif_Nese;

public class Car_Test {

    //Nesne oluşturulur
    //Nesnelerin özellikleri erişebilmek


    public static void main(String[] args) {

        Object a=new Object();
        //new tanımlamak bellekte sağlar.
        Car car1=new Car();

        Car_Test car_test=new Car_Test();
        car_test.deneme();
        //car1 nesnesi stackte oluşuyor.

        System.out.println("CAR 1" + car1.ad + " Hız " + car1.hiz + " Yıl" + car1.yil + " Model " + car1.model );

        car1.ad="Clio";
        car1.model="Renault";
        car1.hiz=22;
        car1.yil=19.90;

        System.out.println("CAR 1" + car1.ad + " Hız " + car1.hiz + " Yıl" + car1.yil + " Model " + car1.model );

        Car car2=new Car();

        car2.ad="Egea";
        car2.model="Fiat";
        car2.hiz=22;
        car2.yil=19.90;

        System.out.println("CAR 2" + car2.ad + " Hız " + car2.hiz + " Yıl" + car2.yil + " Model " + car2.model );

        car1.git(car1.ad);
        car1.dur(car1.ad);

        car2.git(car2.ad);
        car2.dur(car2.ad);
        System.out.println("------------------------");
        car2.git(car1.ad);
      //  car2.git("Clio");

      // car1=car2;

        car1.hiz=car2.hiz;

     //   if (car1==car2){
     //       System.out.println("Car 1 ve Car2 eşittir.");
     //   }




    }

    public void deneme(){

    }
}

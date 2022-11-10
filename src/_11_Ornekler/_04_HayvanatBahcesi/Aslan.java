package _11_Ornekler._04_HayvanatBahcesi;

public class Aslan extends Hayvan{
    private int yeleUzunlugu;

    public void tirnaklariniKes(){
        System.out.println("Aslanın Tırnakları Kesildi");
    }

    public int getYeleUzunlugu() {
        return yeleUzunlugu;
    }

    public void setYeleUzunlugu(int yeleUzunlugu) {
        this.yeleUzunlugu = yeleUzunlugu;
    }
}

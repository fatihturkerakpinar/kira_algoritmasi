import java.util.ArrayList;
import java.util.List;

public class Bina extends Konut {
    // bina classı konuttan miras alır
    Bina(String adres, int katSayisi) {
        super(adres);
        this.numberOfFloors = katSayisi;
    }

    int numberOfFloors;
    //kat sayısını bu değişkende tutucam



    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Kat sayısı: " + numberOfFloors);
    }
    //abstract klastan override ettiğim methodu ekledim


}
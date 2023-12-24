import java.util.ArrayList;
import java.util.List;

public class evSahibi {
    String ad;
    String soyAd;
    Bina bina;

    Daire daire;
    ArrayList<Daire> daireler;


    public evSahibi(String ad, String soyAd, Bina Bina) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.bina = Bina;
        daireler = new ArrayList<Daire>();
    }


    public void displayInfo() {
        System.out.print("Ev sahibi adı soyadı: " + ad+ " " + soyAd + "\nBinasının adresi: " + bina.adres + "\nBinasının kat sayısı: " + bina.numberOfFloors);
    }

    public void addApartment(Daire daire) {
        daireler.add(daire);
    }


}
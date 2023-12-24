public abstract class Konut {
    String adres;

    Konut(String adres) {
        this.adres = adres;
    }


    void displayInfo() {
        System.out.println("Adres : " + adres);
    }
}
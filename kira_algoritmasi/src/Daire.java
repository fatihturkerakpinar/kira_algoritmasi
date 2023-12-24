public class Daire extends Konut {
    private int apartmentNumber;
    int daireSıraNo;


    Daire(String adres, int daireNo, int daireSıraNo) {
        super(adres);
        this.apartmentNumber = daireNo;
        this.daireSıraNo = daireSıraNo;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Daire numarası: " + apartmentNumber);
    }


    int compareTo(Daire daire) {

        if (this.apartmentNumber < daire.apartmentNumber) {
            return -1;
        } else if (this.apartmentNumber == daire.apartmentNumber) {
            return 0;
        } else {
            return 1;
        }
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }
}
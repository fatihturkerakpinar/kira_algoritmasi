public class Main {
    public static void main(String[] args) {
        Bina binaNo1 = new Bina("İstanbul", 5);
        evSahibi evSahibi = new evSahibi("Kenan", "Birkan", binaNo1);


        Daire daireNo1 = new Daire("Esenler", 2, 9);
        Daire daireNo2 = new Daire("Üsküdar", 7, 2);
        Daire daireNo3 = new Daire("Fatih", 4, 5);
        evSahibi.addApartment(daireNo1);
        evSahibi.addApartment(daireNo2);
        evSahibi.addApartment(daireNo3);


        Kiraci kiraci = new Kiraci("Ünal", "Yıldız", evSahibi);


        System.out.println("\n Ev Sahibinin Bilgileri: ");
        evSahibi.displayInfo();
        System.out.println("\n Binanın Bilgileri :  ");
        binaNo1.displayInfo();
        System.out.println("\n Daireler : ");
        daireNo1.displayInfo();
        daireNo2.displayInfo();
        daireNo3.displayInfo();
        System.out.println("\n Kiracı : ");
        kiraci.displayInfo();
    }
}
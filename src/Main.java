import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Seller seller1 = new Seller("Petr Jablonský", LocalDate.of(2003, 11,5), 20, 10.5, true, "Liškova 5, Ostrava" );
        Seller seller2 = new Seller ("Milan Kožíšek", LocalDate.of(2015,1,30), 2, 8.66, false, "Homolkova 15, Brno");

        System.out.println("Jméno prvního prodejce je: " + seller1.getName() + " a jeho adresa je: " + seller1.getAddress() + ".");
        System.out.println("Jméno druhého prodejce je: " + seller2.getName() + " a jeho adresa je: " + seller2.getAddress() + ".");
    }
}
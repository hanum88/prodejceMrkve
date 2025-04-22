import java.time.LocalDate;

public class Seller {
    private String name;
    private LocalDate birthDate;
    private int countOfContracts;
    private double tonsSold;
    private boolean seniorSeller;
    private String address;


    public Seller(String name, LocalDate birthDate, int countOfContracts, double tonsSold, boolean seniorSeller, String address) {
        this.name = name;
        this.birthDate = birthDate;
        this.countOfContracts = countOfContracts;
        this.tonsSold = tonsSold;
        this.seniorSeller = seniorSeller;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getCountOfContracts() {
        return countOfContracts;
    }

    public double getTonsSold() {
        return tonsSold;
    }

    public boolean isSeniorSeller() {
        return seniorSeller;
    }

    public String getAddress() {
        return address;
    }


}

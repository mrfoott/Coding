package OOP.Module0_Basic.Ex4;

import java.text.DecimalFormat;

public class Vehicle {
    DecimalFormat df = new DecimalFormat("#,###");

    private String bikeOwner;
    private String bikeBrand;
    private int bikePrice;
    private int bikeCyCa;

    private int tax;

    public Vehicle() {
        bikeOwner = "null";
        bikeBrand = "null";
        bikePrice = 0;
        bikeCyCa = 0;
    }

    public Vehicle(String bikeOwner, String bikeBrand, int bikeCyCa, int bikePrice) {
        if (bikeOwner.trim().equals("")) {
            this.bikeOwner = "null";
        } else {
            this.bikeOwner = bikeOwner;
        }

        if (bikeBrand.trim().equals("")) {
            this.bikeBrand = "null";
        } else {
            this.bikeBrand = bikeBrand;
        }

        if (bikePrice >= 0) {
            this.bikePrice = bikePrice;
        } else {
            this.bikePrice = 0;
        }

        if (bikeCyCa >= 0) {
            this.bikeCyCa = bikeCyCa;
        } else {
            this.bikeCyCa = 0;
        }
    }

    public void setBikeOwner(String bikeOwner) {
        if (bikeOwner.trim().equals("")) {
            this.bikeOwner = "null";
        } else {
            this.bikeOwner = bikeOwner;
        }
    }

    public void setBikeBrand(String bikeBrand) {
        if (bikeBrand.trim().equals("")) {
            this.bikeBrand = "null";
        } else {
            this.bikeBrand = bikeBrand;
        }
    }

    public void setBikePrice(int bikePrice) {
        if (bikePrice >= 0) {
            this.bikePrice = bikePrice;
        } else {
            this.bikePrice = 0;
        }
    }

    public void setBikeCyCa(int bikeCyCa) {
        if (bikeCyCa >= 0) {
            this.bikeCyCa = bikeCyCa;
        } else {
            this.bikeCyCa = 0;
        }
    }

    public int registrationTax() {
        if (bikeCyCa >= 0 && bikeCyCa < 100) {
            return tax = bikePrice / 100;
        } else if (bikeCyCa >= 100 && bikeCyCa <= 200) {
            return tax = (bikePrice * 2) / 100;
        } else {
            return tax = (bikePrice * 5) / 100;
        }
    }

    @Override
    public String toString() {
        return String.format("%-30s | %-20s | %10d | %10d | %10d", bikeOwner, bikeBrand, bikeCyCa, bikePrice, registrationTax());
    }
}

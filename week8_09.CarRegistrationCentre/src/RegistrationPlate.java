
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    public String getRegistrationCode() {
        return this.regCode;
    }

    public String getCountry() {
        return this.country;
    }
    
    @Override
    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public int hashCode() {
        if (this.regCode == null) {
            return 7;
        }

        return this.country.hashCode() + this.regCode.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        RegistrationPlate other = (RegistrationPlate) obj;

        if (!this.country.equals(other.getCountry())) {
            return false;
        }

        if (this.regCode == null || !this.regCode.equals(other.getRegistrationCode())) {
            return false;
        }

        return true;
    }

}

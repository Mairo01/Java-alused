package Week8.Ex9;

public class RegistrationPlate {
    private final String regCode;
    private final String country;
    
    public RegistrationPlate(String country, String regCode) {
    	this.regCode = regCode;
    	this.country = country;
    }

	public String toString() {
    	return country + " " + regCode;
    }
    public int hashCode() {
        if (this.regCode == null) {
            return 7;
        }

        return this.country.hashCode() + this.regCode.hashCode();
    }
    
    public boolean equals(Object inputPlate) {
    	if (inputPlate == null || this.getClass() != inputPlate.getClass()) return false;
    	
    	RegistrationPlate plate = (RegistrationPlate) inputPlate;
    	
    	if (this.country.equals(plate.country) || this.country.equals(plate.regCode)) return true;
    	return false;
    }

}

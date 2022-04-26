
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }
    
    
    public String getLatinName() {
        return this.latinName;
    }
    

    public int getRingingYear() {
        return this.ringingYear;
    }
    
    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }

    @Override
    public int hashCode() {
        if (this.name == null) {
            return 7;
        }
        return this.latinName.hashCode() + this.ringingYear;
    }
    
    
    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (getClass() != object.getClass()) {
            return false;
        }
        
        Bird compared = (Bird) object;
        
        if (this.name == null) {
            return false;
        }
                       
        return latinName.equals(compared.getLatinName()) && this.ringingYear == compared.getRingingYear();
            
        }
    }




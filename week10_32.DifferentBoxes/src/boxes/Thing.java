package boxes;

import java.util.Objects;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {
        if (weight <0) {
            throw new IllegalArgumentException("Weight has to be 0 or above");
        }
        this.name = name;
        this.weight = weight;
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Thing other = (Thing) obj;
        
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    public int hashCode(){
        return this.name.hashCode() + 7;
    }

}

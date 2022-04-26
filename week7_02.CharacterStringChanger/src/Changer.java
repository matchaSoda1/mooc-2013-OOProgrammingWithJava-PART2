import java.util.List;
import java.util.ArrayList;

public class Changer {
    
    private List<Change> changes;
    
    public Changer(){
        this.changes = new ArrayList<Change>();
    }
    
    public void addChange(Change change){
        this.changes.add(change);
    }
    
    public String change(String characterString){
        String word = characterString;
        for (Change change : changes){
            word = change.change(word);
        }
        return word;
    }
    
}

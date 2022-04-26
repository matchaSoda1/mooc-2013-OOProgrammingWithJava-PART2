package dictionary;
 
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Test your dictionary here
             
        
        PersonalMultipleEntryDictionary myDict = new PersonalMultipleEntryDictionary();
        
        myDict.add("kuusi", "six");
        myDict.add("kuusi", "spruce");
        
        myDict.add("pii", "silicon");
        myDict.add("pii", "pi");
        
        System.out.println(myDict.translate("kuusi"));
        System.out.println(myDict.translate("pii"));
        
        myDict.remove("pii");
        System.out.println(myDict.translate("pii"));
    }
    
}


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Test your program here
        String word1 = "carrot";
        char charFrom = 'a';
        char charTo = 'b';

//        String newWord = word1.replace(charFrom, charTo);    
//        System.out.println(newWord);

        Change change1 = new Change(charFrom, charTo);
        Change change2 = new Change('r', 'x');
//        System.out.println(change1.change(word1));
//        System.out.println(change2.change(word1));

        ArrayList<Change> changes = new ArrayList<Change>();

        changes.add(new Change('a', 'b'));
        changes.add(new Change('k', 'x'));
        changes.add(new Change('o', 'å'));

        String word = "carrot";

        for (Change Change : changes) {
            word = Change.change(word);
        }

        System.out.println(word);  // print pårxxbnb
    }
}

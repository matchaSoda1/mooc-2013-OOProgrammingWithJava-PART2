
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        // printWithSmileys("Method");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");

        printWithSmileys("EIGHT COWS");

    }

    private static void printWithSmileys(String characterString) {

        if (characterString.length() % 2 != 0) {

            //top 
            printSmiley();
            printSmileyLine(characterString);
            

            //middle
            printSmiley();
            System.out.print(" " + characterString + "  ");
            printSmiley();

            System.out.println("");

            //bottom
            printSmiley();
            printSmileyLine(characterString);
            

        } else {
            
            //top
            printSmileyLine(characterString);

            //middle
            printSmiley();
            System.out.print(" " + characterString + " ");
            printSmiley();

            System.out.println("");

            //bottom
            printSmileyLine(characterString);

        }

    }

    private static void printSmiley() {
        System.out.print(":)");
    }
    
    private static void printSmileyLine(String string1){
        for (int i = 0; i < (string1.length() + 6) / 2; i++) {
                printSmiley();
            }
            System.out.println("");
    }
            
}

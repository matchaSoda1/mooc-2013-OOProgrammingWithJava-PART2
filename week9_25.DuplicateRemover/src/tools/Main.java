package tools;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Test your class here

        Set<String> noDuplicates = new HashSet<String>();

        noDuplicates.add("rabbit");
        noDuplicates.add("cookie");
        noDuplicates.add("muffin");
        noDuplicates.add("rabbit");

//        System.out.println(noDuplicates);
        PersonalDuplicateRemover duplicateRemover = new PersonalDuplicateRemover();

        duplicateRemover.add("rabbit");
        duplicateRemover.add("cookie");
        duplicateRemover.add("lemon");
        duplicateRemover.add("ginger");
        duplicateRemover.add("ginger");
        duplicateRemover.add("ginger");
        duplicateRemover.add("ginger");
        duplicateRemover.add("ginger");
        duplicateRemover.add("ginger");

        System.out.println(duplicateRemover.getNumberOfDetectedDuplicates());
        System.out.println(duplicateRemover.getUniqueCharacterStrings());

        duplicateRemover.empty();
        System.out.println(duplicateRemover.getUniqueCharacterStrings());
    }
}

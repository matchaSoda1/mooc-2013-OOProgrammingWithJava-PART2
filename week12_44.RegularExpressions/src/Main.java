
public class Main {

    public static void main(String[] args) {
        // write test code here
//        System.out.println(isAWeekday("abc"));
//        System.out.println(isAWeekday("sun"));

        System.out.println(clockTime("aa:aa:aa"));
        
        System.out.println("");
        System.out.println(clockTime("22:12:12"));
        System.out.println(clockTime("09:00:56"));
        System.out.println(clockTime("19:00:00"));
        System.out.println(clockTime("23:30:56"));
        
        System.out.println("");
        System.out.println(clockTime("09:70:56"));
        System.out.println(clockTime("26:12:12"));
    }

    public static boolean isAWeekDay(String string) {

        return string.matches("(mon|tue|wed|thu|fri|sat|sun)");
    }

    public static boolean allVowels(String string) {
        return string.matches("(a|e|i|o|u|å|ä|ö)+");
    }
    
    public static boolean clockTime(String string) {
        //first two digits: 
            //between 00-23
            
//            ([01][0-9]|[2][0-3])
//                [01] 0 or 1, [0-9] between 0 and 9
//                | means or, e.g. (a|b) is a or b
//                2[0-3] means 2 followed by a number between 0 and 3

//                (:[0-5][0-9]){2} means first number is between 0 and 5, 
//                then second number is between 0 and 9. {2} curly brackets means repeats twice

        return string.matches("([01][0-9]|2[0-3])(:[0-5][0-9]){2}");
    }
}

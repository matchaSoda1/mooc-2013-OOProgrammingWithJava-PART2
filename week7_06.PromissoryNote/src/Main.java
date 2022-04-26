public class Main {
    public static void main(String[] args) {
        
        PromissoryNote mattsNote = new PromissoryNote();
        
        mattsNote.setLoan("George", 20.2);
        mattsNote.setLoan("Michael", 51.5);
        
        System.out.println(mattsNote.howMuchIsTheDebt("George"));
        System.out.println(mattsNote.howMuchIsTheDebt("Michael"));
    }
}

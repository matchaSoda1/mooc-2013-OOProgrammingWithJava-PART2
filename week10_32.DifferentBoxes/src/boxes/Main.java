package boxes;

public class Main {

    public static void main(String[] args) {
        // Test your program here
        MaxWeightBox smallBox = new MaxWeightBox(6);
        
        Thing banana = new Thing("Banana",1);
        Thing slightlyBiggerBanana = new Thing("Bigger banana",3);
        Thing chonkyBanana = new Thing("Chonky banana",6);
        
        OneThingBox oneBanana = new OneThingBox();
        System.out.println(oneBanana.isInTheBox(chonkyBanana));
        oneBanana.add(chonkyBanana);
        System.out.println(oneBanana.isInTheBox(chonkyBanana));
        
        
        
    }
}

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){

          //All 495 cards as an ArrayList
        List <Card> cards = new ArrayList<Card>();
        cards.add(new Card("Cloth Making", "Orange", 50, 50, 0, 5, 0, 10, 0,
         "Naval Warfare", 10, 1)); 
        cards.add(new Card("Sculpture", "Blue", 50, 50, 5, 10, 0, 0, 0,
         "Architecture", 10, 1)); 
         cards.add(new Card("Mysticism", "Blue and Yellow", 50, 50, 0, 5, 0, 0, 5, 
         "Monument", 10, 1)); 
         cards.add(new Card("Urbanism", "Red", 50, 50, 10, 0, 5, 0, 0, 
         "Diplomacy", 10, 1));
         cards.add(new Card("Architecture", "Blue", 140, 140, 0, 10, 5, 0, 0, 
         "Mining", 20, 3)); 
         cards.add(new Card("Naval Warfare", "Red", 160, 160, 10, 0, 0, 5, 0,
         "Diaspora", 20, 3));
         cards.add(new Card("Monument", "Yellow and Orange", 180, 180, 0, 0, 0, 10, 10, 
         "Wonder of the World", 20, 3));
         cards.add(new Card("Mining ", "Orange", 230, 230, 0, 0, 5, 20, 0,
         null, 0, 6)); 
         cards.add(new Card("Provincial Empire", "Red", 260, 260, 20, 0, 0, 0, 5,
         null, 0, 6)); 
         cards.add(new Card("Diaspora", "Yellow", 270, 270, 0, 5, 0, 0, 20,
         null, 0, 6));
         cards.add(new Card("Wonder of the World", "Blue and Orange", 290, 290, 0, 20, 0, 20, 0, 
         null, 0, 6)); 
       
      

        //Create a cardstack that can be manipulated
        CardStack CardStack = new CardStack(cards); 
        while (true) {
        System.out.println(CardStack.toString());
        
    
        int index = scan.nextInt(); 
        CardStack.Buy(index);
        }
    }

    
}
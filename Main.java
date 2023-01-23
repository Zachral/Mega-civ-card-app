import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){


        //All 495 cards as an array
        Card[] cards = new Card[]{
            new Card("Cloth Making", "Orange ", 50, 0, 5, 0, 10, 0,
             "Naval Warfare", 10, 1),
            new Card("Sculpture", "Blue", 50, 5, 10, 0, 0, 0, 
            "Architecture", 10, 1),
            new Card("Mysticism", "Blue and Yellow", 50, 0, 5, 0, 0, 5, 
            "Monument", 10, 1),
            new Card("Urbanism", "Red", 50, 10, 0, 5, 0, 0, 
            "Diplomacy", 10, 1),
            new Card("Architecture", "Blue", 140, 0, 10, 5, 0, 0, 
            "Mining", 20, 3),
            new Card("Diplomacy", "Blue", 160, 5, 10, 0, 0, 0,
             "Provincial Empire", 20, 3),
            new Card("Naval Warfare", "Red", 160, 10, 0, 0, 5, 0,
             "Diaspora", 20, 3),
            new Card("Monument", "Yellow and Orange", 180, 0, 0, 0, 10, 10, 
            "Wonder of the World", 20, 3),
            new Card("Mining  ", "Orange", 230, 0, 0, 5, 20, 0,
             null, 0, 6),
            new Card("Provincial Empire", "Red", 260, 20, 0, 0, 0, 5,
             null, 0, 6),
            new Card("Diaspora", "Yellow", 270, 0, 5, 0, 0, 20,
             null, 0, 6),
            new Card("Wonder of the World", "Blue and Orange", 290, 0, 20, 0, 20, 0, 
            null, 0, 6), 
        }; 

        //Create a cardstack that can be manipulated
        CardStack CardStack = new CardStack(cards); 

        int index = scan.nextInt(); 
        CardStack.Buy(index);
      
    }
}
public class CardStack{

    private Card[] cards; 
    private Hand hand = new Hand();
    
    public CardStack(Card[] cards) {
        this.cards = new Card[cards.length];
        for (int i = 0; i < this.cards.length; i++){
            this.cards[i] = new Card(cards[i]); 
             
        }
    }
    
    public void Buy (int index){
         += hand.redDiscountTotal;   
    }; 


    

}
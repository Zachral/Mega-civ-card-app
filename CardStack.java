public class CardStack{

    private Card[] cards; 
    Hand hand = new Hand();
  
    
    public CardStack(Card[] cards) {
        this.cards = new Card[cards.length];
        for (int i = 0; i < this.cards.length; i++){
            this.cards[i] = new Card(cards[i]); 
             
        }
    }
    // Adds discounts to colors, points and moves card.
    public void Buy (int index){
        hand.redDiscountTotal += this.cards[index].getRedDiscount();
        hand.blueDiscountTotal += this.cards[index].getBlueDiscount(); 
        hand.greenDiscountTotal += this.cards[index].getGreenDiscount();
        hand.orangeDiscountTotal += this.cards[index].getOrangeDiscount();
        hand.yellowDiscountTotal += this.cards[index].getYellowDiscount();  
        hand.pointsTotal += this.cards[index].getPoints();

        //Loop checks if CardDiscount name matches an unbought card and subtracts the discount from cost.
        for (int i = 0; i < cards.length; i++){
            if (this.cards[index].getCardDiscount().equals(this.cards[i].getName())){
                this.cards[i].setCost(this.cards[i].getCost() - this.cards[index].getAmountCardDiscount());
                System.out.println(this.cards[i].getName() + this.cards[i].getCost());
                break; 
            }
        }
    }; 


    

}
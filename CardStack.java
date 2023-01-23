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
                this.cards[i].setOriginalCost(this.cards[i].getOriginalCost() - this.cards[index].getAmountCardDiscount());
                System.out.println(this.cards[i].getName() + this.cards[i].getOriginalCost());
                break; 
            }
        }

        //Loop updates the cost of cards with the new discountTotal (will this discount many times? Add variable Original cost?)
        for (int i = 0; i < cards.length; i++){
            if (this.cards[i].getColor().equals("Red")){
                this.cards[i].setCurrentCost(this.cards[i].getOriginalCost() - hand.redDiscountTotal);
            }
            if (this.cards[i].getColor().equals("Blue")){
                this.cards[i].setCurrentCost(this.cards[i].getOriginalCost() - hand.blueDiscountTotal);
            }
            if (this.cards[i].getColor().equals("Green")){
                this.cards[i].setCurrentCost(this.cards[i].getOriginalCost() - hand.greenDiscountTotal);
            }
            if (this.cards[i].getColor().equals("Orange")){
                this.cards[i].setCurrentCost(this.cards[i].getOriginalCost() - hand.orangeDiscountTotal);
            }
            if (this.cards[i].getColor().equals("Yellow")){
                this.cards[i].setCurrentCost(this.cards[i].getOriginalCost() - hand.yellowDiscountTotal);
            }
            if (this.cards[i].getColor().equals("Blue and Yellow")){
                int highestDiscount = (hand.blueDiscountTotal > hand.yellowDiscountTotal) ? hand.blueDiscountTotal : hand.yellowDiscountTotal;
                this.cards[i].setCurrentCost(this.cards[i].getOriginalCost() - highestDiscount);
            }
            if (this.cards[i].getColor().equals("Yellow and Orange")){
                int highestDiscount = (hand.yellowDiscountTotal > hand.orangeDiscountTotal) ? hand.yellowDiscountTotal : hand.orangeDiscountTotal;
                this.cards[i].setCurrentCost(this.cards[i].getOriginalCost() - highestDiscount);
            }
            if (this.cards[i].getColor().equals("Blue and Orange")){
                int highestDiscount = (hand.blueDiscountTotal > hand.orangeDiscountTotal) ? hand.blueDiscountTotal : hand.orangeDiscountTotal;
                this.cards[i].setCurrentCost(this.cards[i].getOriginalCost() - highestDiscount);

            }
        }

        
    }
    }; 


    


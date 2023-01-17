public class Card {
    
    private String Name;
    private String Color;
    private int Cost; 
    private int RedDiscount;
    private int BlueDiscount;
    private int GreenDiscount;
    private int OrangeDiscount;
    private int YellowDiscount; 
    private String CardDiscount; 
    private int AmountCardDiscount; 
    private int Points;
    



    public Card(String Name, String Color, int Cost, int RedDiscount, int BlueDiscount, int GreenDiscount, int OrangeDiscount, int YellowDiscount, 
    String CardDiscount, int AmountCardDiscount, int Points) {
        this.Name = Name;
        this.Color = Color;
        this.Cost = Cost;
        this.RedDiscount = RedDiscount;
        this.BlueDiscount = BlueDiscount;
        this.GreenDiscount = GreenDiscount;
        this.OrangeDiscount = OrangeDiscount;
        this.YellowDiscount = YellowDiscount;
        this.CardDiscount = CardDiscount;
        this.AmountCardDiscount = AmountCardDiscount;
        this.Points = Points; 
    }
   

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getColor() {
        return this.Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getCost() {
        return this.Cost;
    }

    public void setCost(int Cost) {
        this.Cost = Cost;
    }

    public int getRedDiscount() {
        return this.RedDiscount;
    }

    public void setRedDiscount(int RedDiscount) {
        this.RedDiscount = RedDiscount;
    }

    public int getBlueDiscount() {
        return this.BlueDiscount;
    }

    public void setBlueDiscount(int BlueDiscount) {
        this.BlueDiscount = BlueDiscount;
    }

    public int getGreenDiscount() {
        return this.GreenDiscount;
    }

    public void setGreenDiscount(int GreenDiscount) {
        this.GreenDiscount = GreenDiscount;
    }

    public int getOrangeDiscount() {
        return this.OrangeDiscount;
    }

    public void setOrangeDiscount(int OrangeDiscount) {
        this.OrangeDiscount = OrangeDiscount;
    }

    public int getYellowDiscount() {
        return this.YellowDiscount;
    }

    public void setYellowDiscount(int YellowDiscount) {
        this.YellowDiscount = YellowDiscount;
    }

    public String getCardDiscount() {
        return CardDiscount;
    }

    public void setCardDiscount(String cardDiscount) {
        CardDiscount = cardDiscount;
    }

    public int getAmountCardDiscount() {
        return AmountCardDiscount;
    }

    public void setAmountCardDiscount(int amountCardDiscount) {
        AmountCardDiscount = amountCardDiscount;
    }

    public void setPoints(int points) {
        Points = points;
    }

    public int getPoints() {
        return Points;
    }


    @Override
    public String toString() {
        return "{" +
            " Name='" + getName() + "'" +
            ", Color='" + getColor() + "'" +
            ", Cost='" + getCost() + "'" +
            ", RedDiscount='" + getRedDiscount() + "'" +
            ", BlueDiscount='" + getBlueDiscount() + "'" +
            ", GreenDiscount='" + getGreenDiscount() + "'" +
            ", OrangeDiscount='" + getOrangeDiscount() + "'" +
            ", YellowDiscount='" + getYellowDiscount() + "'" +
            "}";
    }
    

}

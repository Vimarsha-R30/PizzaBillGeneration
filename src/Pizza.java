public class Pizza {
    private  int price;
    private Boolean veg;
    private final int extraCheese = 100;
    private final int extraToppings = 150;
    private final int bagPack = 20;
    private final int basePizzaPrice;
    private Boolean isExtraCheeseAdded = false;
    private Boolean isExtraToppingsAdded = false;
    private Boolean isOptedForTakeAway = false;
    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        } else{
            this.price = 400;
        }
        this.basePizzaPrice = this.price;
    }
    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        this.price += extraCheese;
    }
    public void addExtraToppings(){
        isExtraToppingsAdded = true;
        this.price += extraToppings;
    }
    public void takeAway(){
        isOptedForTakeAway = true;
        this.price += bagPack;
    }
    public void getBill(){
        String bill = "";
        System.out.println("Pizza " + basePizzaPrice);
        if(isExtraCheeseAdded){
            bill += "Extra cheese added " + extraCheese + "\n";
        }
        if(isExtraToppingsAdded){
            bill += "Extra toppings added " + extraToppings + "\n";
        }
        if(isOptedForTakeAway){
            bill += "Take away and enjoy " + bagPack + "\n";
        }
        bill += "Bill " + this.price + "\n";
        System.out.println(bill);
    }
}

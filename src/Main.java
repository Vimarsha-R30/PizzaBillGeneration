public class Main {
    public static void main(String[] args) {
       Pizza pizza = new Pizza(true);
       pizza.addExtraCheese();
       pizza.addExtraToppings();
       pizza.takeAway();
       pizza.getBill();
       DelaxPizza delaxPizza = new DelaxPizza(false);
       delaxPizza.getBill();
    }
}
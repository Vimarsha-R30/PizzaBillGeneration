public class DelaxPizza extends Pizza{
    public DelaxPizza(Boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }
}

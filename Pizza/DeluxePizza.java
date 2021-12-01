package Pizza;

public class DeluxePizza extends Pizza {
    protected int noOfToppings;
    
    DeluxePizza(int total, int noOfToppings) {
        super(total, 200);
        this.noOfToppings = noOfToppings;
    }
}

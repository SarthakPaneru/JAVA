package Pizza;

public class DeluxePizza extends Pizza {
    protected int noOfToppings;
    
    DeluxePizza(int total, int noOfToppings) {
        super(total, 200);
        this.noOfToppings = noOfToppings;
    }

    DeluxePizza() {
        this(0, 0);
    }

    void getToppings(int x) {
        this.noOfToppings = x;
    }

    int getPrice() {
        return (super.getPrice()+this.noOfToppings*20*this.total);
    }
}

package Pizza;

public class StandardPizza extends Pizza {
    //private int price;

    StandardPizza(int total, int noOfToppings) {
        super(total, 100, noOfToppings);
    }

    void getTotal(int total) {
        this.total += total;
    }

    //void getPrice(int price)
}

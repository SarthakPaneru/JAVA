package Pizza;

import java.util.Scanner;

public class Pizza {
    protected int total;
    private int price;
    //protected int noOfToppings;

    Pizza(int total, int price) {
        this.total = total;
        this.price = price;
        //this.noOfToppings = noOfToppings;
    }

    Pizza() {

    }

    void getTotal() {
        //return 0;
    }

    int getPrice() {
        return (total*this.price);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Order your Pizza \n1. Standard Pizza \n2. Deluxe Pizza");
        int choice = s.nextInt();

        switch (choice) {
            case 1:
            {
                StandardPizza stdP = new StandardPizza(6);
                System.out.println(stdP.getPrice());
                break;
            }
            case 2:
                System.out.println("Do you want to add extra toppings(only upto 3)? If yes specifyor press 0 to ignore: ");
                int x = s.nextInt();
                DeluxePizza dlxP = new DeluxePizza(7, x);
                System.out.println(dlxP.getPrice());
                break;
        
            default:
                break;
        }
    }
}

package Ecommerce_Site;

public class Product {
    private String name;
    private int id;

    Image I;

    Product(String name, int id, Image I) {
        this.name = name;
        this.id = id;
        this.I = I;
    }

    void display() {
        System.out.println("Product informaiton:");
        System.out.println("\nName: " + this.name + "\nId: " + this.id);

        this.I.display();
    }

    public static void main(String[] args) {
        Image I = new Image(100, 65, "jpeg", false);

        Product P = new Product("Shoe", 12, I);

        P.display();
    }
}

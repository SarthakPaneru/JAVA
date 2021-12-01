package Ecommerce_Site;

public class Image {
    private int height;
    private int width;
    private String type;
    private Boolean isColoured;

    Image(int height, int width, String type, Boolean isColoured) {
        this.height = height;
        this.width = width;
        this.type = type;
        this.isColoured = isColoured;
    }

    void display() {
        System.out.println("\nInfo about Image: ");
        System.out.println("Dimension: " + this.height + " * " + this.width);
        System.out.println("Type: " + this.type);
        System.out.println("Coloured: " + this.isColoured);
    }
}

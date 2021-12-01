public class Shape {
    int x_cordinate, y_coordinate, width, height;

    public Shape(int x_cordinate, int y_coordinate, int width, int height) {
        this.x_cordinate = x_cordinate;
        this.y_coordinate = y_coordinate;
        this.width = width;
        this.height = height;
    }

    public Shape(int width, int height) {
        this(0, 0, width, height);
    }

    public Shape() {
        this(0, 0, 1, 1);
    }

    @Override
    public String toString() {
        String info = "x_cordinate: " + x_cordinate + "\ny_coordinate: " + y_coordinate + "\nwidth: " + width + "\nheight: " + height;
        return info;
    }

    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Shape(5, 3);
        Shape s3 = new Shape(1, 2, 3, 4);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

public class Overriding {
    String text;

    @Override
    public String toString() {
        String text = this.text;
        return text;
    }

    Overriding(String text) {
        this.text = text;
    }

    public static void main(String[] args) {
        Overriding o = new Overriding("Hey there!");
        System.out.println(o);
    }
}

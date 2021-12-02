// Decimal to Binary

class Convert {
    public static void main(String[] args) {
        int decimal = 250;
        System.out.println(convert(decimal));
    }
    static int convert(int d) {
        if(d==0) {
            return 0;
        } else {
            return (d%2 + 10 * convert(d/2));
        }
    }
}

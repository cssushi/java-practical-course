public class TypeCasting {

    public static void main(String[] args) {

        int number = 10;
        double decimal = number; // no info lost, widening  

        System.out.println("Original int: " + number);
        System.out.println("Converted to double: " + decimal);

        double price = 19.99;
        int wholePrice = (int) price; // lose info, therefore gotta specify Narrowing (specify)

        System.out.println("Original double: " + price);
        System.out.println("Converted to int: " + wholePrice);

        int x = 260;
        // overflow condition
        byte y = (byte) x;

        System.out.println("Original int: " + x);
        System.out.println("Converted to byte: " + y);
    }
}
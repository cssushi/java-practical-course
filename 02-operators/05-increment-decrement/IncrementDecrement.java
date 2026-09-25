public class IncrementDecrement {

    public static void main(String[] args) {

        int x = 5;

        System.out.println("x: " + x);

        x++;
        System.out.println("After x++: " + x);

        ++x;
        System.out.println("After ++x: " + x);

        x--;
        System.out.println("After x--: " + x);

        --x;
        System.out.println("After --x: " + x);

        x = 5;

        int a = x++;
        int b = ++x;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("x: " + x);

        // postfix
        // a gets x as is, then x increments
        // value of a remains as old x

        // prefix
        // x gets incremented, then a gets x
        // value of a becomes new x
    }
}
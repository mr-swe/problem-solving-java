package number;

public class Fibonacci {

    static int a = 0;
    static int b = 1;
    static int c = 0;

    void usingLoop(int length) {
        System.out.print(a + " " + b);
        for (int i = 2; i < length; i++) {
            c = a + b;
            a = b;
            b = c;

            System.out.print(" " + c);
        }
    }

    void usingRecursion(int input) {
        if (input > 0) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" " + c);
            usingRecursion(input - 1);
        }
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
//        fibonacci.usingLoop(8);

        System.out.print(a + " " + b);
        fibonacci.usingRecursion(5);
    }
}

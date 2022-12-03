package number;

public class PrimeNumber {

    void usingInput(int number) {
        if (number == 0 || number == 1) {
            System.out.println(number + " Not a Prime Number");
        } else if (number == 2) {
            System.out.println(number + " Prime Number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number + " Prime Number");
            } else {
                System.out.println(number + " Not a Prime Number");
            }
        }
    }

    void checkArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for (int k : arr) {
            if (k == 0 || k == 1) {
                System.out.println(k + " Not a Prime Number");
            } else if (k == 2) {
                System.out.println(k + " Prime Number");
            } else {
                boolean isPrime = true;
                for (int j = 2; j < k; j++) {
                    if (k % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(k + " Prime Number");
                } else {
                    System.out.println(k + " Not a Prime Number");
                }
            }
        }
    }

    public static void main(String[] args) {
        PrimeNumber number = new PrimeNumber();
//        number.usingInput(97);
        number.checkArray();
    }

}

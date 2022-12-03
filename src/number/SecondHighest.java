package number;

public class SecondHighest {
    public static void main(String[] args) {
        int[] arr = {12, 4, 31, 6, 1, 10};
        int max = arr[0];
        int secondMax = 0;

        for (int number : arr) {
            if (max < number) {
                secondMax = max;
                max = number;
            } else if (secondMax < number) {
                secondMax = number;
            }
        }
        System.out.println(secondMax);
    }
}

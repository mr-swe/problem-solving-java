package number;

public class FindMax {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 12, 5, 7, 11, 12};
        int max = arr[0];
        int count = 0;

        for (int j : arr) {
            if (max == j) {
                count++;
            } else if (max < j) {
                max = j;
                count = 1;
            }
        }
        System.out.println("max is " + max + " and have " +  count);
    }

}

package number;

public class FindMax {

    static private void max() {
        int[] arr = {2, 4, 10, 3, 10, 8, 10};
        int max = arr[0];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) {
                count ++;
            } else if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max number is: " + max + " and " + count + " times here");
    }

    public static void main(String[] args) {
        FindMax.max();
    }

}

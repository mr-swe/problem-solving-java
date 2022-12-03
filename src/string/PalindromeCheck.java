package string;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        String reverseStr = "";
        for (int i = 0; i < str.length(); i++) {
            reverseStr = str.charAt(i) + reverseStr;
        }
        if (reverseStr.equals(str)) {
            System.out.println("palindrome");
        } else
            System.out.println("not a palindrome");

    }
}

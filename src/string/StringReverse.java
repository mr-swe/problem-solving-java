package string;

public class StringReverse {

    String str = "Hello";

    void usingStringBuilder() {
        StringBuilder builder = new StringBuilder();
        builder.append(str);
        builder.reverse();
        System.out.println(builder);
    }

    void usingLoop() {
        String reverseStr = "";
        for (int i = 0; i < str.length(); i++) {
            reverseStr = str.charAt(i) + reverseStr;
        }
        System.out.println(reverseStr);
    }

    public static void main(String[] args) {
        StringReverse stringReverse = new StringReverse();
        stringReverse.usingLoop();
    }
}

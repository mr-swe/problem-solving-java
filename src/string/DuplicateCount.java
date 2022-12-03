package string;

import java.util.*;

public class DuplicateCount {

    String str = "Character";

    void usingMap() {
        this.str = str.toUpperCase();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            for (int j = i + 1 ; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count ++;
                }
            }
            if (!map.containsKey(String.valueOf(str.charAt(i)))) {
                map.put(String.valueOf(str.charAt(i)), count);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public static void main(String[] args) {
        DuplicateCount count = new DuplicateCount();
        count.usingMap();
    }

}

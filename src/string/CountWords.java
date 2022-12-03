package string;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CountWords {

    public static void main(String[] args) {
        String str = "This this is done and done";
        str = str.toUpperCase();
        String[] split = str.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < split.length; i++) {
            int count = 1;
            for (int j = i + 1; j < split.length; j++) {
                if (Objects.equals(split[i], split[j])) {
                    count ++;
                }
            }
            if (!map.containsKey(split[i])) {
                map.put(split[i], count);
            }
        }
        System.out.println(map);
    }
}

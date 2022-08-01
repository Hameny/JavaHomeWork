package tms.java.lesson12.lesson13hw.task1;

import java.util.*;

public final class ClassUtil {

    private ClassUtil() {
    }

    public static Map<String, Integer> CountWord(String text) {
        text = text.replaceAll("[-.?!)(,:]", "");
        List<String> list = new ArrayList<>(Arrays.asList(text.split(" ")));
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            String word = list.get(i);
            if (map.containsKey(word)) {
                map.replace(word, map.get(word) + 1);
            } else map.put(word, 1);
        }
        return map;
    }
}

package tms.java.lesson12.lesson13hw.task3;

import java.util.ArrayList;
import java.util.List;

public final class TextEditorUtil {

    private static final String SNOWFLAKES = "****";
    private static final int NUMBER_LETTERS_IN_WORD = 4;

    private TextEditorUtil() {
    }

    public static void markLength4(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }

        List<String> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == NUMBER_LETTERS_IN_WORD) {
                newList.add(SNOWFLAKES);
                newList.add(list.get(i));
            } else {
                newList.add(list.get(i));
            }
        }

        list = new ArrayList<>(newList);
        System.out.println(list);
    }
}



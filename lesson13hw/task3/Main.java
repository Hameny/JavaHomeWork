package tms.java.lesson12.lesson13hw.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> listWithWords = new ArrayList<>(List.of(new String[]{"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"}));

        TextEditorUtil.markLength4(listWithWords);
    }
}

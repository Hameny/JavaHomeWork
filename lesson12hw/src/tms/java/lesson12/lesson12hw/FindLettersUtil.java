package tms.java.lesson12.lesson12hw;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class FindLettersUtil {

    private static final String LETTERS = "абвгдеёжзийклмнопрстуфхцчшщъьэюя";

    private FindLettersUtil() {
    }

    public static void printNumber(File file) {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file))) {
            byte[] bytes = bufferedInputStream.readAllBytes();
            StringBuilder text = new StringBuilder((new String(bytes)).toLowerCase());
            numberEachLetter(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void numberEachLetter(StringBuilder text) {
        int[] countLetter = new int[LETTERS.length()+1];
        for (int i = 0; i < text.length(); i++) {
            if (LETTERS.indexOf(text.charAt(i)) != -1) {
                countLetter[LETTERS.indexOf(text.charAt(i))]++;
            }
        }
        for (int i = 0; i < 32; i++) {
            System.out.println("Letter " + LETTERS.charAt(i) + " found in text: " + countLetter[i]);
        }
    }
}


package by.tms.lesson10.hw;

import java.util.Locale;

public final class Utils {

    private Utils() {
    }

    public static boolean examinationPalindrome(String inputText) {
        String newInputText = inputText.replaceAll(" ", "");
        StringBuilder builderInputText = new StringBuilder(newInputText);
        String reverseInputText = builderInputText.reverse().toString();
        return reverseInputText.toLowerCase().equals(newInputText.toLowerCase());
    }

    public static String Polindrome(String inputText) {
        if (examinationPalindrome(inputText)) {
            StringBuilder palindrome = new StringBuilder();
            palindrome.append("Text: ").append(inputText).append(", is a palindrome");
            return palindrome.toString();
        } else {
            StringBuilder notPalindrome = new StringBuilder();
            notPalindrome.append("Text: ").append(inputText).append(", is not a palindrome");
            return notPalindrome.toString();
        }
    }

    public static int translateRomanToArabic(String romanNumber) {
        int arabicNumber = 0;
        char[] charOfRoman = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] charValueOfRoman = {1, 5, 10, 50, 100, 500, 1000};
        for (int i = 0; i < romanNumber.length(); i++) {
            checkChar:
            {
                for (int j = 0; j < charOfRoman.length; j++) {
                    if (romanNumber.charAt(i) == charOfRoman[j]) {
                        if (i == romanNumber.length() - 1) arabicNumber += CharValueOfRoman[j];
                        else {
                            for (int m = j + 1; m < charOfRoman.length; m++) {
                                if (romanNumber.charAt(i + 1) == charOfRoman[m]) {
                                    arabicNumber += (CharValueOfRoman[m] - CharValueOfRoman[j]);
                                    i++;
                                    break checkChar;
                                }
                            }
                            arabicNumber += CharValueOfRoman[j];
                        }
                    }
                }
            }
        }
        return arabicNumber;
    }
}


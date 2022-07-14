package by.tms.lesson10.hw;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input text: ");
        String inputText = scanner.nextLine();
        System.out.println(Utils.isPolindrome(inputText));
        System.out.print("Input Roman number from I to MMMCMXCIX:");
        String romanNumber = scanner.nextLine();
        System.out.println("Roman number " + romanNumber + " = Arabic number " + Utils.translateRomanToArabic(romanNumber));

    }
}




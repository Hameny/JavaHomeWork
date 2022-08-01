package tms.java.lesson12.lesson12hw;

import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public final class SortedNumber {

    public static final String RANDOM_TXT = "resources/RandomFile.txt";
    public static final String SORTED_TXT = "resources/SortedFile.txt";

    private SortedNumber() {
    }

    public static void createFileWithSortedNumber(int countRandomNumber) {
        createRandom(countRandomNumber);
        sortedRandom(countRandomNumber);
    }

    private static void sortedRandom(int countRandomNumber) {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(RANDOM_TXT));
             BufferedWriter fileWriterSorted = new BufferedWriter(new FileWriter(SORTED_TXT))) {
            Scanner scan = new Scanner(bufferedInputStream);
            int[] numbers = new int[countRandomNumber];
            while (scan.hasNextInt()) {
                for (int i = 0; i < countRandomNumber; i++) {
                    numbers[i] = scan.nextInt();
                }
            }
            Arrays.sort(numbers);
            for (int num : numbers) {
                fileWriterSorted.write(num + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createRandom(int countRandomNumber) {
        try (BufferedWriter fileWriterRandom = new BufferedWriter(new FileWriter(RANDOM_TXT))) {
            Random random = new Random();
            for (int i = 0; i < countRandomNumber; i++) {
                fileWriterRandom.write(random.nextInt(9999) + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


package tms.java.lesson12.lesson11hw;

import java.util.Random;

public final class ExceptionUtil {

    private ExceptionUtil() {
    }

    public static void getNullPointerException() {
        String str = null;
        str.length();
    }

    public static void getArrayIndexOutOfBoundsException() {
        int[] array = new int[3];
        try {
            System.out.println(array[5]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Index of the array is wrong: " + e);
        }
    }

    public static void generateIllegalArgumentException(String name, String surname) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Uncorrected user first name");
        }
        String userFirstName = name;

        if (surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("Uncorrected user surname");
        }
        String userSurname = surname;
    }

    public static void throwException() {
        throw new NullPointerException();
    }

    public static void randomException() throws Exception {
        Exception[] exceptions = {new NullPointerException(), new ArithmeticException(), new ArrayIndexOutOfBoundsException()};
        Random random = new Random();
        throw exceptions[random.nextInt(3)];
    }

    public static void secondThrowException() {
        int randomEx = (int) (Math.random() * 2);
        if (randomEx == 1) {
            throw new ArithmeticException();
        }
    }
}

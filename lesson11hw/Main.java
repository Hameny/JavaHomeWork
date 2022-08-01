package tms.java.lesson12.lesson11hw;

import static tms.java.lesson12.lesson11hw.ExceptionUtil.*;

public class Main {

    public static void main(String[] args) throws VerifiableException {

        try {
            ExceptionUtil.getNullPointerException();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        ExceptionUtil.getArrayIndexOutOfBoundsException();

        try {
            ExceptionUtil.generateIllegalArgumentException(null, "");
        } catch (IllegalArgumentException e) {
            System.out.println("Message: " + e.getMessage());
        }

        try {
            throwException();
        } catch (NullPointerException e) {
            throw new VerifiableException("Caught exception " + e);
        }

        try {
            randomException();
        } catch (NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            secondThrowException();
            System.out.println("Worked try");
        } catch (Exception e) {
            System.out.println("Worked catch");
        } finally {
            System.out.println("Worked finally");
        }

    }
}


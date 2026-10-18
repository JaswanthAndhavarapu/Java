import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 1. ArithmeticException
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("1. ArithmeticException");
        }

        // 2. ArrayIndexOutOfBoundsException
        try {
            int a[] = {1, 2, 3};
            System.out.println(a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2. ArrayIndexOutOfBoundsException");
        }

        // 3. NullPointerException
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("3. NullPointerException");
        }

        // 4. NumberFormatException
        try {
            int n = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("4. NumberFormatException");
        }

        // 5. StringIndexOutOfBoundsException
        try {
            String s = "Java";
            System.out.println(s.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("5. StringIndexOutOfBoundsException");
        }

        // 6. InputMismatchException
        try {
            Scanner sc = new Scanner("hello");
            int n = sc.nextInt();
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("6. InputMismatchException");
        }

        // 7. NegativeArraySizeException
        try {
            int a[] = new int[-5];
        } catch (NegativeArraySizeException e) {
            System.out.println("7. NegativeArraySizeException");
        }

        // 8. ClassCastException
        try {
            Object obj = "Hello";
            Integer n = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("8. ClassCastException");
        }

        // 9. FileNotFoundException
        try {
            FileInputStream f =
                new FileInputStream("missing_file_123.txt");
        } catch (FileNotFoundException e) {
            System.out.println("9. FileNotFoundException");
        }

        // 10. ClassNotFoundException
        try {
            Class.forName("NoSuchClass12345");
        } catch (ClassNotFoundException e) {
            System.out.println("10. ClassNotFoundException");
        }
    }
}

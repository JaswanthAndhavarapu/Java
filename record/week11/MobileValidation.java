import java.util.Scanner;

class LengthNotSufficientException extends Exception {
    LengthNotSufficientException(String s) {
        super(s);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mobile number: ");
        String n = sc.nextLine();

        try {
            if (!n.matches("[0-9]+"))
                throw new NumberFormatException();

            if (n.length() > 10)
                throw new ArrayIndexOutOfBoundsException();

            if (n.length() < 10)
                throw new LengthNotSufficientException("Invalid");

            System.out.println("Valid number");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Mobile Number-ArrayIndexOutOfBounds Exception");
        }
        catch (LengthNotSufficientException e) {
            System.out.println("Invalid Mobile Number – LengthNotSufficientException");
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid Mobile Number – NumberFormatException");
        }
        finally {
            sc.close();
        }
    }
}
```

import java.util.Scanner;

public class Methods {

    // Factorial
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // Prime
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Maximum
    static int maximum(int a, int b) {
        return (a > b) ? a : b;
    }

    // Area of Circle
    static double area(double r) {
        return 3.14 * r * r;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Factorial");
        System.out.println("2. Prime Check");
        System.out.println("3. Maximum of Two Numbers");
        System.out.println("4. Area of Circle");
        System.out.print("Enter your choice: ");

        int ch = sc.nextInt();

        switch (ch)
         {

            case 1:
                System.out.print("Enter a number: ");
                int n = sc.nextInt();
                System.out.println("Factorial = " + factorial(n));
                break;

            case 2:
                System.out.print("Enter a number: ");
                int p = sc.nextInt();
                if (isPrime(p))
                    System.out.println("Prime Number");
                else
                    System.out.println("Not a Prime Number");
                break;

            case 3:
                System.out.print("Enter first number: ");
                int a = sc.nextInt();
                System.out.print("Enter second number: ");
                int b = sc.nextInt();
                System.out.println("Maximum = " + maximum(a, b));
                break;

            case 4:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.println("Area = " + area(r));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
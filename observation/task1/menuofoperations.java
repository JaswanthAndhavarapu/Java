import java.util.Scanner;
public class MenuOfOperations {

    public static long findFactorial(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static boolean checkPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int findMaximum(int firstNumber, int secondNumber) {

        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public static double calculateArea(double radius) {

        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. Find Factorial");
            System.out.println("2. Check Prime Number");
            System.out.println("3. Find Maximum of Two Numbers");
            System.out.println("4. Calculate Area of Circle");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter a number: ");
                    int number = sc.nextInt();

                    long factorial = findFactorial(number);

                    System.out.println("Factorial of " + number + " = " + factorial);

                    break;

                case 2:

                    System.out.print("Enter a number: ");
                    int primeNumber = sc.nextInt();

                    boolean result = checkPrime(primeNumber);

                    if (result) {
                        System.out.println(primeNumber + " is a Prime Number.");
                    } else {
                        System.out.println(primeNumber + " is not a Prime Number.");
                    }

                    break;

                case 3:

                    System.out.print("Enter first number: ");
                    int first = sc.nextInt();

                    System.out.print("Enter second number: ");
                    int second = sc.nextInt();

                    int maximum = findMaximum(first, second);

                    System.out.println("Maximum Number = " + maximum);

                    break;

                case 4:

                    System.out.print("Enter the radius: ");
                    double radius = sc.nextDouble();

                    double area = calculateArea(radius);

                    System.out.printf("Area of Circle = %.2f%n", area);

                    break;

                case 5:

                    System.out.println("Program Ended.");

                    break;

                default:

                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}

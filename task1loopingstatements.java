import java.util.Scanner;
public class LoopingStatements {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n========== MENU ==========");
	            System.out.println("1. Print Multiplication Table");
	            System.out.println("2. Display Numbers from 1 to N");
	            System.out.println("3. Sum of First N Natural Numbers");
	            System.out.println("4. Generate Fibonacci Series");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");

	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    System.out.print("\nEnter the number: ");
	                    int table = sc.nextInt();

	                    System.out.println("\nMultiplication Table of " + table);

	                    for (int i = 1; i <= 10; i++) {
	                        System.out.println(table + " x " + i + " = " + (table * i));
	                    }
	                    break;

	                case 2:
	                    System.out.print("\nEnter the value of N: ");
	                    int n = sc.nextInt();

	                    System.out.println("\nNumbers from 1 to " + n + " are:");

	                    for (int i = 1; i <= n; i++) {
	                        System.out.print(i + " ");
	                    }
	                    System.out.println();
	                    break;

	                case 3:
	                    System.out.print("\nEnter the value of N: ");
	                    int num = sc.nextInt();

	                    int sum = 0;

	                    for (int i = 1; i <= num; i++) {
	                        sum += i;
	                    }

	                    System.out.println("Sum of first " + num + " natural numbers = " + sum);
	                    break;

	                case 4:
	                    System.out.print("\nEnter the number of terms: ");
	                    int terms = sc.nextInt();

	                    int first = 0;
	                    int second = 1;

	                    System.out.println("\nFibonacci Series:");

	                    for (int i = 1; i <= terms; i++) {
	                        System.out.print(first + " ");

	                        int next = first + second;
	                        first = second;
	                        second = next;
	                    }

	                    System.out.println();
	                    break;

	                case 5:
	                    System.out.println("\nThank you! Program terminated.");
	                    break;

	                default:
	                    System.out.println("\nInvalid Choice! Please enter a number between 1 and 5.");
	            }

	        } while (choice != 5);

	        sc.close();
	    }
	}

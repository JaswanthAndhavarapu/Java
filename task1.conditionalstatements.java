import java.util.Scanner;
class Functions{
	void even0dd(int num) {
		if(num==0) {
			System.out.println("the enterd number'0'cannot be determined whether it is even or odd");
		}
		else if(num%2==0) {
			System.out.println("the given number"+num+" is  even");
		}
		else 
				System.out.println("the given number"+num+" is  odd");
			
		}
int findLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
}
        void displayGrade(double percentage) {
            if (percentage >= 90) {
                System.out.println("Grade: A+");
            } else if (percentage >= 80) {
                System.out.println("Grade: A");
            } else if (percentage >= 70) {
                System.out.println("Grade: B");
            } else if (percentage >= 60) {
                System.out.println("Grade: C");
            } else if (percentage >= 50) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }
        }
	
        void displayDay(int day) {
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid day! Enter a number between 1 and 7.");
            }
        }
	
	
	}
	

public class ConditionalStatements {
public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		Functions f=new Functions();
		do {
			System.out.println("enter your choce based on the menu");
	System.out.println("=====Menu======");
	System.out.println("1.Even or Odd check");
	System.out.println("2.Largest of Three Numbers");
	System.out.println("3.Grade based percentage");
	System.out.println("4.Display Day of the Week");
	System.out.println("5.Exit");
	System.out.println("enter your choce based on the menu");
	choice=sc.nextInt();
	switch(choice) {
	case 1:
	{
		int num;
		System.out.println("enter the number which you wanna find out the even or odd:");
		num=sc.nextInt();
		f.even0dd(num);
	}
	break;
	case 2:
	{
		int a,b,c;
		System.out.println("enter the three numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println("the largest of the thre numbers is:"+f.findLargest(a,b,c));
	}
	break;
	case 3:
	{
		Double percent;
		System.out.println("enter yi=ou marks in percentage");
		percent=sc.nextDouble();
		f.displayGrade(percent);
	}
	break;
	case 4:
	{
		int x;
		System.out.println("===== WEEK DAYS MENU =====");
        System.out.println("1. Monday");
        System.out.println("2. Tuesday");
        System.out.println("3. Wednesday");
        System.out.println("4. Thursday");
        System.out.println("5. Friday");
        System.out.println("6. Saturday");
        System.out.println("7. Sunday");
System.out.println("enter your day based on the menu");
x=sc.nextInt();
f.displayDay(x);
	}
	break;
	}
		} while(choice!=5);
}
}

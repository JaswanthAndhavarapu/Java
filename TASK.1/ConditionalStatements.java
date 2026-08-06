import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice:  1.EvenOrOdd,2.Largest,3.Grade,4.Days");
        int ch=sc.nextInt();
        
        switch (ch)
         {
            case 1:

            System.out.println("Enter a number: ");
            int num=sc.nextInt();
            if(num % 2==0)
            {
                System.out.println("Given number is a even number");
            }
            else
            {
                System.out.println("Given number is a odd number");
            }
            sc.close();

                break;

            case 2:

            System.out.println("Enter three numbers : ");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

             if (a >= b && a >= c)
                System.out.println("largest: "+a);
             else if (b >= a && b >= c)
                System.out.println("Largest is : "+b);
             else
                System.out.println("Largest is : "+c);
            break;

            case 3:

               System.out.print("Enter Percentage: ");
                    double per = sc.nextDouble();

                    if (per >= 90)
                        System.out.println("Grade A");
                    else if (per >= 75)
                        System.out.println("Grade B");
                    else if (per >= 60)
                        System.out.println("Grade C");
                    else if (per >= 40)
                        System.out.println("Grade D");
                    else
                        System.out.println("Fail");
                    break;

            case 4:

                System.out.print("Enter Day Number (1-7): ");
                    int day = sc.nextInt();

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
                            System.out.println("Invalid Day");
                    }
                    break;

            default:

               System.out.println("Enter a valid choice");
                break;
        }
        }
    
    }
    
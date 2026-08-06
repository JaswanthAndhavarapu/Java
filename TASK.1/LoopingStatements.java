import java.util.Scanner;

public class LoopingStatements {
    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println(" 1.Table\n 2.numbers (1-10)\n 3.sum of n numbers\n 4.fibonacci\n");
        System.out.println("Enter your choice : ");
         int ch=sc.nextInt();

         switch (ch)
         {
            case 1:
                
                System.out.println("Enter a number : ");
                int n=sc.nextInt();

                for(int i=1;i<=10;i++)
                {
                   System.out.println(n + "x" + i + "=" + (n * i));
                }
                break;
            case 2:
                
                System.out.print("Enter N: ");
                    int num = sc.nextInt();

                    for (int i = 1; i <= num; i++)
                        System.out.print(i + " ");
                    break;

             case 3:

                    System.out.print("Enter a number: ");
                    int m = sc.nextInt();

                    int sum = 0;

                    for (int i = 1; i <= m; i++)
                        sum += i;

                    System.out.println("Sum = " + sum);
                    break;
            case 4:

                     System.out.print("Enter Number of Terms: ");
                      int k= sc.nextInt();

                    int first = 0, second = 1,next;

                    for (int i = 1; i <= k; i++) 
                    { 
                        System.out.print(first + " ");
                        next=first+second;
                        first=second;
                        second = next;
                    }
                    System.out.println();
                    break;

            default:
                 System.out.println("Enter a valid choice");
                break;
         }
         sc.close();
    }
}

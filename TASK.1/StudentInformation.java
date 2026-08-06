import java.util.Scanner;

public class StudentInformation 
{
    public static void main(String[] args) 
    {
        
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name=sc.nextLine();
        System.out.println("Enter the roll number: ");
        int rollno=sc.nextInt();
        System.out.println("Enter the no of subjects: ");
        int sub=sc.nextInt();
        int total=0;
        for(int i=1;i<=sub;i++)
        {
            System.out.println("Enter the marks of subject "+i+":");
            int marks=sc.nextInt();
            total=total +marks;
        }
        int percentage;
        percentage=(total)/sub;
        System.out.println("The student name is : "+name);
        System.out.println("Student rool no is : "+rollno);
         System.out.println("Total marks is: "+total);
         System.out.println("The percentage of the student marks is: "+percentage);
        sc.close();

    }
}


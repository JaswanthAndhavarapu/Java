import java.util.Scanner;
class Studentx{
	String name;
	int rollno;
	private int s1marks;
	private int s2marks;
	private int s3marks;
	 public Studentx(String n,int x,int y,int z,int e){
		this.name=n;
		this.rollno=x;
		if(s1marks<=100 && s2marks<=100 && s3marks<=100) {
		this.s1marks=y;
		this.s2marks=z;
		this.s3marks=e;
		}
		else{
			System.out.println("invalid marks entered");
		}
	}
	void DisplayDetails() {
		System.out.println("the name of the stident is:"+name);
		System.out.println("the roll no of the student is:"+rollno);
		System.out.println("the s1marks of the stdent is:"+s1marks);
		System.out.println("the s2marks of the stdent is:"+s2marks);
		System.out.println("the s3marks of the stdent is:"+s3marks);
	}
	void DisplayResult() {
		System.out.println("the total maks of the student is:"+(s1marks+s2marks+s3marks));
		System.out.println("the percentage of marks is:"+((s1marks+s2marks+s3marks)/3));
	}
}
public class StudentManagement {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the name of the stident:");
	String name=sc.nextLine();
	System.out.println("enter the roll no of the student:");
	int rollno=sc.nextInt(); 
	System.out.println("enter the s1 marks of the student");
	int s1marks=sc.nextInt();
	System.out.println("enter the s2 marks of the student");
	int s2marks=sc.nextInt();
	System.out.println("enter the s3 marks of the student");
	int s3marks=sc.nextInt();
	Studentx s=new Studentx(name,rollno,s1marks,s2marks,s3marks);
	int choice;
	do {
	System.out.println("===Menu===");
	System.out.println("1.Display student details");
	System.out.println("2.Display Result");
	System.out.println("3.Exit");
	System.out.println("enter your choice based on the menu");
	choice =sc.nextInt();
	switch(choice) {
	case 1:
	s.DisplayDetails();
	break;
	case 2:
	s.DisplayResult();
	break;
	case 3:
		System.out.println("Exiting the Management");
		System.out.println("Thank You");
		break;
	default :
		System.out.println("Invalid option");	
	}
	
	} while(choice!=3);
	
	
	
}
}

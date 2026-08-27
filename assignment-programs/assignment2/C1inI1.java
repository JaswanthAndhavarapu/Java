import java.util.Scanner;

interface I3{
    Scanner sc=new Scanner(System.in);
    //in interfaces, we must initialize the variables
    int x=20;
   // int e;  wrong
    void add();

}
public class C1InI1 implements I3{
    int y;//in classes, it's our wish to initialize variables
    @Override
    public void add() {
        System.out.println("enter the value of y");
        y=sc.nextInt();
        System.out.println("the value of x is"+x);
        System.out.println("the sum of two numbers is :"+(x+y));
        try {
int r=x/y;
            System.out.println("the division of two numbers is:"+r);
        }catch(ArithmeticException ae){
            System.out.println("the value of y is not zero");
        }
    }

    public static void main(String[] args) {
C1InI1 cs=new C1InI1();
cs.add();
    }
}

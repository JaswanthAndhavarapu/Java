import java.util.InputMismatchException;
import java.util.Scanner;

class Aa{
    int a=20;
    public Aa(){
        this.a=a;
    }
    void add(){
        System.out.println("the value of a is :"+a);
    }
}
public class TryAndCatch extends Aa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=10;
        System.out.println("enter the value of r :");
        int  r=sc.nextInt();
        try{
         int w=b/r;
            System.out.println("the value of w is:"+w);
        }catch(ArithmeticException ae){
System.out.println("do not enter the zero");
        }catch(InputMismatchException ime){
            System.out.println("do not enter the characters");
        }
TryAndCatch tac=new TryAndCatch();
        tac.add();
        }

    }


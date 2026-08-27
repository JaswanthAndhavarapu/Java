import java.util.Scanner;

class As{
    int a;
    Scanner sc=new Scanner(System.in);
    void add() {
        System.out.println("enter the value of a :");
        a=sc.nextInt();
        System.out.println("the value of x is :" + a);
    }
}
class Bd extends As{
    int b;
    void sub() {
        System.out.println("enter the value of b :");
        b=sc.nextInt();
        System.out.println("the diff of a and b is :"+(a-b));
    }
}
public class C1InC2 {
    public static void main(String[] args) {
        Bd bd=new Bd();
        bd.add();
        bd.sub();
    }
}

import java.util.Scanner;

class Bb{
    Scanner sc=new Scanner(System.in);
    int a;
    void add(){
        System.out.println("enter the value of a :");
         a=sc.nextInt();
        System.out.println("the value of a is :"+a);
        System.out.println("this is a method in super class ");
    }
}
class Ss extends Bb{
   int b;
    void sum(){
        System.out.println("enter the value of b :");
         b=sc.nextInt();
        System.out.println("the value of b is :"+b);
        System.out.println("the sum of a and b is :"+(a+b));
    }
}
class Ww extends Ss{
    void eds(){
        System.out.println("this is hybrid inheritance");
    }
}
class Rr extends Ss{
    void sub(){
        System.out.println("the diff between a and b is :"+(a-b));
    }
}
public class HybridInheritance {
    public static void main(String[] args) {
Ww re=new Ww();
Rr ew=new Rr();
re.add();
re.sum();
re.eds();
ew.add();
ew.sum();
ew.sub();
    }
}

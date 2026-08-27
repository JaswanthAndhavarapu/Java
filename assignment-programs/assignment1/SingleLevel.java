class A{
    void sum(int x){
        System.out.println("the value of x is :"+x);
    }
}
public class B extends A{

    void sub(int y){
        System.out.println("the value of y is :"+(y));
    }
    public static void main(String[] args) {
        B obj = new B();
        obj.sum(10);
        obj.sub(20);
    }
}

class A{
    int a=10,b=20;
    void add(){
        System.out.println("the result is" +( a+b));
    }

}
class B extends A{
    void sub (){
        System.out.println("the result is " +(a-b));
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.add();
        obj.sub();
    }
}

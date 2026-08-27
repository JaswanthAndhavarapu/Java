interface I1{
    void sum();
}
class A {
    int x;
}

public class ClassInheritance extends A implements I1 {
    @Override
    public void sum() {
        System.out.println("the value of x is :" + (x));
    }
    public static void main(String[] args) {
        System.out.println("this is class in interface");
        ClassInheritance ci=new ClassInheritance();
        ci.sum();
    }
}

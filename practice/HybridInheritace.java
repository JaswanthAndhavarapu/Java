class One{
    int a=10,b=20;
    void add(){
        System.out.println("the result is"+(a+b));
    }
}
class Two extends One{
    void sub(){
        System.out.println("the result is "+(a-b));
    }
 }
 class Three extends One{
    void mul(){
        System.out.println("the result is "+(a*b));
    }
 }
class Four extends Two{
    void div(){
        System.out.println("the result is "+(a/b));
    }
}
public class HybridInheritance {
    public static void main(String[] args){
        Four obj1 = new Four();
        obj1.add();
        obj1.sub();
        obj1.div();
        Three obj2 = new Three();
        obj2.mul();


    }
}

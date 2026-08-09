class One{
    int a=5,b=9;
    void add(){
        System.out.println("the result is "+(a+b));
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
public class HierarichalInheritance {
    public static void main(String[] args){
        Two obj1 = new Two();
        obj1.add();
        obj1.sub();
        Three obj2 = new Three();
        obj2.mul();
    }
    
}

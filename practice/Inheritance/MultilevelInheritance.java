class One{
    int a=30,b=40;
    void add(){
        System.out.println("the result is" +(a+b));
    }
}
class Two extends One{
    void sub(){
        System.out.println("the result is "+(a-b));
    }
}
class Three extends Two{
    void mul(){
        System.out.println("the result is "+(a*b));
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Three obj = new Three();
        obj.add();
        obj.sub();
        obj.mul();
    }
    
}

class M{
    float x=98.43f;
    void mul(int y) {
        System.out.println("the mul is :" + (x * y));
    }
}
class Y extends M{

    void name(String name){
        System.out.println("the student "+name+ " secured "+x+" percentage");
        System.out.println(x);
    }
}
class R extends Y{
    void div(){
        System.out.println("this is multilevel inheritance");

    }
}
public class MultiLevel {
   public  static void main(String[] args) {
        R man = new R();
       man.mul(2);
       man.name("manodhara");
       man.div();

    }
}class M{
    float x=98.43f;
    void mul(int y) {
        System.out.println("the mul is :" + (x * y));
    }
}
class Y extends M{

    void name(String name){
        System.out.println("the student "+name+ " secured "+x+" percentage");
        System.out.println(x);
    }
}
class R extends Y{
    void div(){
        System.out.println("this is multilevel inheritance");

    }
}
public class MultiLevel {
   public  static void main(String[] args) {
        R man = new R();
       man.mul(2);
       man.name("manodhara");
       man.div();

    }
}

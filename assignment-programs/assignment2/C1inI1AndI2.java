interface I1{
    int x=100;
    abstract void sample();
        }
        interface I2{
    int y=20;
    abstract void sum();
        }



public class Interface implements I1,I2 {

    @Override
    public void sample() {
        System.out.println("this is in I1");
        System.out.println("the sum of the numbers is"+(x+y));
    }
    @Override
    public void sum()
    {
        System.out.println("this is in I2");
        System.out.println("the sub of two numbers is :"+(x-y));
    }
    public static void main(String[] args) {
Interface obj=new Interface();
obj.sample();
obj.sum();
    }
}

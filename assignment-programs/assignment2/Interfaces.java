interface I1{
    int x = 100;

    void sample();
}

interface I2 extends I1{
    int y = 200;

    void demo();
}

class Multi implements I1, I2{

    @Override
    public void sample() {
        System.out.println("This is from interface 1");
    }

    @Override
    public void demo() {
        System.out.println("This is from interface 2");
    }

    void mymehtod() {
        System.out.println("From Child class");

    }

}


public class I1inI2 {
    public static void main(String[] args) {
        Multi mt = new Multi();
        System.out.println(mt.x);
        System.out.println(I2.y);
        mt.demo();
        mt.sample();
        mt.mymehtod();
    }
}

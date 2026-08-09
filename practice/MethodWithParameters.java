package Java;

public class MethodWithParameters {
    static void sum(int a,int b)
    {
        int result;
        result=a+b;
        System.out.println("sum is: "+result);
    }
    public static void main(String[] args) {
        sum(20,30);
    }
}

class SingleCatch{
    public void execute() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException exception) {
            System.out.println("Single Catch: Division by zero is not allowed.");
        }
    }
}
public class TrywithsingleCatch {
    public static void main(String[] args) {
        SingleCatch demo = new SingleCatch();
        demo.execute();
    }
}

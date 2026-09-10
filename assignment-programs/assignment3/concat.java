class ConcatDemo {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Programming";
        
        String c = a.concat(" ");
        c = c.concat(b);
        
        System.out.println("First String = " + a);
        System.out.println("Second String = " + b);
        System.out.println("Result = " + c);
    }
}

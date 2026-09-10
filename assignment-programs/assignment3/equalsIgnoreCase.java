class IgnoreCaseDemo {
    public static void main(String[] args) {
        String a = "Java";
        String b = "JAVA";
        String c = "java";
        
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("A equals B = " + a.equalsIgnoreCase(b));
        System.out.println("C = " + c);
        System.out.println("A equals C = " + a.equalsIgnoreCase(c));
        System.out.println("Case is ignored");
    }
}

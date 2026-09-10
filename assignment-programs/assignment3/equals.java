class EqualsDemo {
    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        String c = "java";
        
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("A equals B = " + a.equals(b));
        System.out.println("C = " + c);
        System.out.println("A equals C = " + a.equals(c));
        System.out.println("equals() is case-sensitive");
    }
}

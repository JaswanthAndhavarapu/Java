class EndsDemo {
    public static void main(String[] args) {
        String str = "Java Programming";
        
        System.out.println("String = " + str);
        System.out.println("Ends with Programming = " + str.endsWith("Programming"));
        System.out.println("Ends with Java = " + str.endsWith("Java"));
        System.out.println("Ends with ing = " + str.endsWith("ing"));
        System.out.println("endsWith() checks ending");
    }
}

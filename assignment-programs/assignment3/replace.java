class ReplaceDemo {
    public static void main(String[] args) {
        String str = "I like Java";
        
        System.out.println("Original = " + str);
        System.out.println("Replace Java = " + str.replace("Java", "Python"));
        System.out.println("Replace I = " + str.replace("I", "We"));
        System.out.println("Original remains = " + str);
        System.out.println("replace() changes specified text");
    }
}

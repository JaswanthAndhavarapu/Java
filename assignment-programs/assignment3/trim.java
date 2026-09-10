class TrimDemo {
    public static void main(String[] args) {
        String str = "   Java Programming   ";
        
        System.out.println("Original = [" + str + "]");
        System.out.println("Length = " + str.length());
        
        String result = str.trim();
        
        System.out.println("After trim = [" + result + "]");
        System.out.println("New Length = " + result.length());
    }
}

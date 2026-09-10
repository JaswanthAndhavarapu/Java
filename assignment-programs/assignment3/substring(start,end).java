class SubRangeDemo {
    public static void main(String[] args) {
        String str = "Programming";
        
        System.out.println("Original = " + str);
        System.out.println("0 to 4 = " + str.substring(0, 4));
        System.out.println("3 to 7 = " + str.substring(3, 7));
        System.out.println("0 to 6 = " + str.substring(0, 6));
        System.out.println("End index is not included");
    }
}

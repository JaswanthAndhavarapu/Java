package number;

import java.util.Scanner;

public class Roman {

    public static int romanToInteger(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I': result += 1; break;
                case 'V': result += 5; break;
                case 'X': result += 10; break;
                case 'L': result += 50; break;
                case 'C': result += 100; break;
                case 'D': result += 500; break;
                case 'M': result += 1000; break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roman Number: ");
        String roman = sc.nextLine();

        int result = romanToInteger(roman);

        System.out.println("Integer Value: " + result);

        sc.close();
    }
}

import java.util.*;

public class LetterCombinations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] phone = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        System.out.print("Enter the digits: ");
        String digits = sc.nextLine();

        List<String> result = new ArrayList<>();
        result.add("");

        for (int i = 0; i < digits.length(); i++) {

            int num = digits.charAt(i) - '0';

            if (num < 2 || num > 9) {
                System.out.println("Enter digits from 2 to 9 only.");
                sc.close();
                return;
            }

            List<String> temp = new ArrayList<>();

            for (String s : result) {
                for (char ch : phone[num].toCharArray()) {
                    temp.add(s + ch);
                }
            }

            result = temp;
        }

        System.out.println("Letter Combinations: " + result);

        sc.close();
    }
}

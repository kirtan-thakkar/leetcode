import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s;
        System.out.println("Enter a string: ");
        s = sc.nextLine();
        int n = s.length();
        boolean flag = true;

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                flag = false;
            }
        }
        
        if (!flag) {
            System.out.println("NOT PALINDROME");
        } else {
            System.out.println("IS PALINDROME");
        }

        System.out.println("Easy :D");
    }
}

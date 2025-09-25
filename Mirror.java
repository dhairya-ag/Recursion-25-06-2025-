import java.util.Scanner;

public class Mirror {
        public static String reverseString(String s) {

        if (s.length() <= 1) {
            return s;
        }

        
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String str = sc.nextLine();

        System.out.println(reverseString(str));
    }
}

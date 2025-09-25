import java.util.Scanner;

public class Steps{
    public static int climbStairs(int n) {
        
        if (n == 0) return 1;
        if (n < 0) return 0;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stairs");
        int n = sc.nextInt();

        System.out.println("the total number of ways are:"+climbStairs(n));
    }
}

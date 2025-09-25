import java.util.Scanner;
public class TreasureBoxes{
    static int  totalCoins(int n,int[] coins){
        int sum=0;
        if(n<=0){
            return 0;
        }
        return coins[n-1]+ totalCoins(n-1, coins);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of boxes: ");
        int n = sc.nextInt();
        int[] coins = new int[n];
        System.out.println("Enter the number of coins in each box: ");
        for (int i = 0; i < n; i++) {
            coins[i]=sc.nextInt();
        }
        int sum=totalCoins(n,coins);
        System.out.println("Total coins are: "+sum);
    }
}
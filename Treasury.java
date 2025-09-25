import java.util.Scanner;
public class Treasury{
    static int  coins(int n){
        int sum=0;
        if(n==0){
            return sum;
        }
        return n+ coins(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of chests: ");
        int n = sc.nextInt();
        int sum=coins(n);
        System.out.println("Total coins are: "+sum);
    }
}
import java.util.Scanner;
public class Lock {
    static int unlock(int locks){
        if(locks==0||locks==1) return 1;
        return locks*unlock(locks-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of locks: ");
        int locks=sc.nextInt();
        int ways = unlock(locks);
        System.out.println("The total ways to unlock are: "+ways);
    }
}

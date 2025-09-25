import java.util.Scanner;
public class Rabbits {
    static int rabbits(int months){
        if(months==0) return 0;
        if(months==1) return 1;
        return rabbits(months-1)+rabbits(months-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of months: ");
        int months=sc.nextInt();
        int totalRabbits = rabbits(months);
        System.out.println("The total no. of rabbits are: "+totalRabbits);
    }
}

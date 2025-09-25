import java.util.Scanner;
public class Drumbeats{
    static void beats(int n){
        if(n==0){
            return;
        }
        beats(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of beats: ");
        int n = sc.nextInt();
        beats(n);
    }
}
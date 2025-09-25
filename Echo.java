import java.util.Scanner;
public class Echo{
    static void echoes(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        echoes(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        echoes(n);
    }
}
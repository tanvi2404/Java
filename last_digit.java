import java.util.Scanner;

public class last_digit {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int y=Math.abs(n);
        int ans=y%10;
        System.out.println(ans);
    }
}

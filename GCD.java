import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=Math.min(a, b);
        int d=1;
        for(int i=1;i<=n;i++){
            if(a%i==0 && b%i==0) {
                d=i;
            }
        }System.out.println(d);
    }
}

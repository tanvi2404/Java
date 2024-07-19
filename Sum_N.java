import java.util.Scanner;

public class Sum_N {

    public static void main(String[] args) {
        // TODO: Implement the main method
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=n*(n+1)/2;
        System.out.println(sum);
    }
}

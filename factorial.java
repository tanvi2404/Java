import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(n>0){
            i=i*n;
            n--;
        }
        while(n<0){
            System.out.print("Invalid");
        }
        System.out.println(i);

    }
}

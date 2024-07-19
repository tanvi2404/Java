import java.util.Scanner;

public class Divisors {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
       int n=sc.nextInt();
       int i=1;
        System.out.println("diviosrs are");
       while(i<=n){
           if(n%i==0){

               System.out.println(i);
           }i++;
       }
    }
}

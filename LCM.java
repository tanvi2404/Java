import java.util.Scanner;

public class LCM {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int s=Math.max(a,b);
       int l=a*b;

       for(int i=s;i<=l;i++){
           if(i%a==0 && i%b==0){
               System.out.println(i);
               break;
           }

       }
    }
}

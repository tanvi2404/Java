import java.util.Scanner;

public class Day_bfor_Ndays {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int n=sc.nextInt();
        int x=n%7;
        int ans=d-x;
        if(ans>x){
            System.out.println(ans);
        }else{
            System.out.println(ans+7);
        }


    }
}

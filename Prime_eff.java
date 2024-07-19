import java.util.Scanner;

public class Prime_eff {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean result = isPrime(n);
        if (result) {
            System.out.println("Given number is prime");
        } else {
            System.out.println("Given number is not prime");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {  // Corrected loop condition
            if (n % i == 0) {
                return false;
            }
        }
        return true;  // Return true after the loop completes
    }
}

import java.util.Scanner;

public class prime_or_not {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isPrime = true;
         
        if (n == 2) {
            System.out.println("n is prime");
        } else {
            for (int i = 2; i<=Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
        }


        if (isPrime == true) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Numper is not prime");
            
        }
        
    }
    
}

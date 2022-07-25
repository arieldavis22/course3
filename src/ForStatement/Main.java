package ForStatement;

public class Main {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));

//        for(double i=2; i<9; i++) {
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
//        }

        for(double i=8; i>1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

//        int count = 0;
//        for(int i=11; i < 30; i++) {
//            if(count == 3) break;
//            if(isPrime(i)) {
//                System.out.println(i + " is prime");
//                count++;
//            }
//        }

        // Challenge
        int total = 0;
        int count = 0;
        for(int i=1;i <= 1000;i++) {
            if(count == 5) break;
            if(i % 3 == 0 && i % 5 == 0) {
                total += i;
                count++;
            }
        }
        System.out.println(total + " is the total");
    }

    public static boolean isPrime(int n) {

        if(n <= 1) {
            return false;
        }

        for(int i=2; i <= (long) Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}

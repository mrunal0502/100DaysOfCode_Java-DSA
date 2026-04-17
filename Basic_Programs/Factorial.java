import java.util.*;

public class Factorial {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();

        for (int i = 0; i < testcases; i++) {
            int n = sc.nextInt();
            long ans = factorial(n);
            System.out.println(ans);
        }

        sc.close();

    }

    public static long factorial(int n) {
        long fact = 1;
        if (n <= 1)
            return fact;

        for (int i = n; i > 1; i--) {
            fact = fact * i;
        }

        return fact;
    }
}
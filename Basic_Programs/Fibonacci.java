public class Fibonacci {
    public static void main(String[] args) {
        int n = 6;

        int a = 0;
        int b = 1;

        if (n >= 1)
            System.out.println(a);
        if (n >= 2)
            System.out.println(b);

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }

    }
}

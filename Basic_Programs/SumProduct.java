public class SumProduct {
    public static void main(String[] args) {
        System.out.println(isSumProduct(135));
    }

    public static String isSumProduct(int n) {

        int original = n;
        int sum = 0;
        int prod = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            prod *= digit;
            n /= 10;
        }

        if (original == sum * prod)
            return "Yes";
        else
            return "No";
    }

}
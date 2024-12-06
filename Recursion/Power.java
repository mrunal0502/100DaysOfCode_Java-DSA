public class Power {
    public static void main(String[] args) {
        System.out.println("Answer is " + power(2, 3));
    }

    public static int power(int base, int pow) {
        if (pow == 0) {
            return 1;
        }

        return base * power(base, pow - 1);
    }
}

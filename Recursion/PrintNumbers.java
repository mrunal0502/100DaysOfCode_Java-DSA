public class PrintNumbers {
    public static void main(String[] args) {
        print1toN(5);
        System.out.println();
        printNto1(5);
    }

    public static void print1toN(int n) {
        if (n == 0) {
            return;
        }
        print1toN(n - 1);
        System.out.println(n);
    }

    public static void printNto1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print1toN(n - 1);

    }
}

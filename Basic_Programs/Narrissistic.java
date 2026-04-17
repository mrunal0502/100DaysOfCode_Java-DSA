
class Narrissistic {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        int n = 153;
        int noOfdigits = 0;
        int temp = n;
        while (temp > 0) {
            noOfdigits++;
            temp = temp / 10;
        }
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + (int) Math.pow(rem, noOfdigits);
            n = n / 10;
        }
    }
}
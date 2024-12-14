public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3; // Number of disks
        solveHanoi(n, 'A', 'C', 'B'); // A: Source, C: Destination, B: Helper
    }

    public static void solveHanoi(int n, char source, char destination, char helper) {
        // Base case: If there's only one disk, move it directly
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Step 1: Move n-1 disks from Source to Helper
        solveHanoi(n - 1, source, helper, destination);

        // Step 2: Move the nth (largest) disk from Source to Destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Step 3: Move n-1 disks from Helper to Destination
        solveHanoi(n - 1, helper, destination, source);
    }
}

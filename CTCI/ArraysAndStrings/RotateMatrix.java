public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int n = matrix.length;
        rotateMatrix(matrix);

        for (int i = 0; i < n; i++) {
            System.out.print('[');
            for (int j = 0; j < n; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println(" ]");
        }
    }

    public static void rotateMatrix(int[][] matrix) {
        // Transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = temp;

            }
        }
    }
}

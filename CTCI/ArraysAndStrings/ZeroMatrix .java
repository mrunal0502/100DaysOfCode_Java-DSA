public class ZeroMatrix {
    public static class Pair {
        int row;
        int col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 0, 6 }, { 7, 8, 9 } };
        int n = matrix.length;
        int m = matrix[0].length;

        Pair p;

        List<Pair> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    p = new Pair(i, j);
                    list.add(p);
                }
            }
        }

        for (Pair pair : list) {
            int row = pair.row;
            int col = pair.col;

            for (int i = 0; i < n; i++) {
                matrix[i][col] = 0;
            }

            for (int j = 0; j < m; j++) {
                matrix[row][j] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print('[');
            for (int j = 0; j < m; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println(" ]");
        }
    }
}

package ClassLesson5;

public class Matrix {
    public static void main(String[] args) {
        int[][] arr =
                {{1, 0, 0, 0},
                        {0, 1, 0, 0},
                        {0, 0, 0, 0}};

        int[][] arr1 = {{1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}};
        int m = arr.length;
        int n = arr1[0].length;
        int o = arr1.length;
        int[][] res = new int[m][n];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += arr[i][k] * arr1[k][j];
                }
            }

        }

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.printf("%6d ", res[i][j]);
            }
            System.out.println();

        }


    }
}
package ClassLesson5;

public class diagonalCollateral {
    public static void main(String[] args) {
        int sum=0;
        int[][] arr =
                {{1, 3, 4},
                {2, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i][arr.length-i-1];


        }
        System.out.println("" + sum);
    }
}

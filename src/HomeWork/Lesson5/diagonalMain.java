package ClassLesson5;

public class diagonalMain {
    public static void main(String[] args) {

        int sum=0;
        int[][] arr =
                {{1, 3, 4},
                {2, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i][i];


        }
        System.out.println("" + sum);
    }
}
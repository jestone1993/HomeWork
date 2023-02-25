package HomeWork.Lesson5;

public class DoubleMassiveSum {
    public static void main(String[] args) {
        int[][] arr = {{1, 5, 6, 7}, {9, 7, 6, 44}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];

            }
        }
        System.out.println("" + sum);
    }
}

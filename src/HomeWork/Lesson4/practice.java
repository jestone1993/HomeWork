package HomeWork.Lesson4;

public class practice {
    public static void main(String[] args) {
        int arr[] = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13};
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];


            }

        }

        System.out.println(max);
        System.out.println(min);
    }


}



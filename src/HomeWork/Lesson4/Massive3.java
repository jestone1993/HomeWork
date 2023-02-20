package HomeWork.Lesson4;

public class Massive3 {
    public static void main(String[] args) {
        int arr[] = {1, 80, 11, 12, 4};
        int arr1[] = {7, 60, 11, 12, 4};
        double avg;
        double avg1;
        int n = arr.length;
        int j = arr1.length;
        int sum = 0;
        int sum1 = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

        }
        for (int t = 0; t < j; t++) {
            sum1 += arr1[t];


        }


        avg1 = (double) sum1 / j;
        avg = (double) sum / n;
        if (avg1 > avg) {
            System.out.println("Среднее число массива :" + avg1 + " " + "Оказалось больше");
        } else if (avg > avg1) {
            System.out.println("Среднее число массива :" + avg + " " + "Оказалось больше");
        } else {
            System.out.println("Числа равны " + " " + avg1 + " " + avg);
        }
        System.out.println("Среднее арфм: " + avg1);

        System.out.println("Среднее армф: " + avg);
    }


}
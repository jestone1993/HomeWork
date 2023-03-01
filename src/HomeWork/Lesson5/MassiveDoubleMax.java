package ClassLesson5;

public class MassiveDoubleMax {
    public static void main(String[] args) {

        int[][] nums2 = {{1, 2, 3},
                {1, 4}};
        int max = nums2[0][0];
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[i][j] > max) ;
                max = nums2[i][j];

            }
        }

        System.out.println("" + max);
    }

}



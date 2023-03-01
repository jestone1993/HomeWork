package ClassLesson5;

public class ChessBoard {
    public static void main(String[] args) {
        String[][] arr = new String[8][8];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < arr[i].length; j++) {

                if ((i + j) % 2 == 0)
                    arr[i][j] = "w";
                else
                    arr[i][j] = "b";


                System.out.print(" " + arr[i][j]);
            }

        }
    }
}
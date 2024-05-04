

public class task11 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5,},
                {6, 7},
                {8, 9, 10}
        };


        for ( int[] arr1:matrix) {
            for (int i: arr1) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}

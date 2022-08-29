import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        matrix = fillMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }

        System.out.println("********************");

        System.out.println(findValues(matrix));
    }

    public static int[][] fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = getRandomNumber();
            }
        }
        return matrix;
    }


    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public static String findValues(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int avg = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) max = matrix[i][j];
                if (matrix[i][j] < min) min = matrix[i][j];
                avg += matrix[i][j];
            }
        }
        avg /= matrix[0].length * matrix.length;
        return String.format("max = %s, min = %s, avg = %s", max, min, avg);
    }
}

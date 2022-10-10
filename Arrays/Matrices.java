package Arrays;

public class Matrices {
    public static void main(String[] args) {
        int[][] matrixA = {
                {4, 2, 6, 4, 2},
                {3, 1, 5, 0, 8},
                {1, 8, 4, 2, 1},
                {7, 3, 2, 4, 4},
        };
        int[][] matrixB = {
                {1, 2, 8, 0, 4},
                {4, 4, 7, 4, 6},
                {5, 1, 9, 1, 3},
                {6, 3, 11, 2, 3},
        };

        int[][] addition = addMatrices(matrixA, matrixB);
        int[][] transposed = transpose(matrixB);
        int[][] multiplied = multiplyMatrices(matrixA, transposed);

        printMatrix(matrixA);
        printMatrix(transposed);
//        printMatrix(addition);
//        printMatrix(transposed);
        printMatrix(multiplied);
    }

    private static void printMatrix(int[][] matrix) {
        //zacni pisat: matrix.for
        //zacni pisat: foreach

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println("----------");
    }

    private static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] addition = new int[4][5];

        for (int row = 0; row < matrixA.length; row++) {
            for (int col = 0; col < matrixA[row].length; col++) {
                addition[row][col] =
                        matrixA[row][col] + matrixB[row][col];
            }
        }

        return addition;
    }

    private static int[][] transpose(int[][] matrixA) {
        int[][] transposed =
                new int[matrixA[0].length][matrixA.length];

        for (int row = 0; row < matrixA.length; row++) {
            for (int col = 0; col < matrixA[row].length; col++) {
                transposed[col][row] = matrixA[row][col];
            }
        }

        return transposed;
    }

    private static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int[][] multiplied =
                new int[matrixA.length][matrixB[0].length];

        for (int row = 0; row < matrixA.length; row++) {
            for (int col = 0; col < matrixB[row].length; col++) {
                for (int temp = 0; temp < matrixB.length; temp++) {
                    multiplied[row][col] +=
                            matrixA[row][temp] * matrixB[temp][col];
                }
            }
        }

        return multiplied;
    }
}

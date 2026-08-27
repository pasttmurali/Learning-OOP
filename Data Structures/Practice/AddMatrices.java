import java.util.Scanner;

class MatrixADT {

    private int[][] matrix;
    private int rows;
    private int cols;

    public MatrixADT(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
    }

    public void insert(int row, int col, int value) {

        if (row < 0 || row >= rows || col < 0 || col >= cols) {
			System.out.println("Invalid index");
			return;
        }

        matrix[row][col] = value;
    }

    public int getElement(int row, int col) {

         if (row < 0 || row >= rows || col < 0 || col >= cols) {
			System.out.println("Invalid index");
			return;
        }

        return matrix[row][col];
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public void traverse() {

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}


public class AddMatrices {

    public static MatrixADT add(MatrixADT m1, MatrixADT m2) {

        if (m1.getRows() != m2.getRows() ||
            m1.getCols() != m2.getCols()) {

            System.out.println("Matrices must have the same size");
			return;
                
        }

        MatrixADT result =
            new MatrixADT(m1.getRows(), m1.getCols());

        for (int i = 0; i < m1.getRows(); i++) {

            for (int j = 0; j < m1.getCols(); j++) {

                int sum = m1.getElement(i, j)
                        + m2.getElement(i, j);

                result.insert(i, j, sum);
            }
        }

        return result;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        MatrixADT m1 = new MatrixADT(rows, cols);
        MatrixADT m2 = new MatrixADT(rows, cols);

        System.out.println("Enter Matrix 1:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                System.out.print(
                    "Enter [" + i + "][" + j + "]: "
                );

                m1.insert(i, j, sc.nextInt());
            }
        }

        System.out.println("Enter Matrix 2:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                System.out.print(
                    "Enter [" + i + "][" + j + "]: "
                );

                m2.insert(i, j, sc.nextInt());
            }
        }

        MatrixADT result = add(m1, m2);

        System.out.println("\nMatrix 1:");
        m1.traverse();

        System.out.println("\nMatrix 2:");
        m2.traverse();

        System.out.println("\nAdded Matrix:");
        result.traverse();

        sc.close();
    }
}
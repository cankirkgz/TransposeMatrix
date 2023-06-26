public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{2, 3, 4}, {5, 6, 7}};
        int[][] transpose = new int[matrix[0].length][matrix.length];

        System.out.println("Matris : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                transpose[j][i] = matrix[i][j];

        System.out.println("Transpoze : ");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++){
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
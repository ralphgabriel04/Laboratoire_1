public class MatrixToolbox {
  
    /**
     * Multiply two matrices.
     * Matrices are row-major, i.e., { { row0 }, { row1 }, ... }.
     * @param matA First matrix
     * @param matB Second matrix
     * @return The result matrix of the multiplication A x B
     */
    public static Double[][] multiply(Double[][] matA, Double[][] matB) {
        int n = matA.length;
        int m = matA[0].length;
        int p = matB[0].length;
        
        // Check if multiplication is possible
        if (m != matB.length) {
            return new Double[][] { { Double.NaN } };
        }
        
        // Initialize result matrix
        Double[][] result = new Double[n][p];
        
        // Perform matrix multiplication
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                result[i][j] = 0.0;
                for (int k = 0; k < m; k++) {
                    result[i][j] += matA[i][k] * matB[k][j];
                }
            }
        }
        
        return result;
    }
    
    /**
     * Display the content of a matrix.
     * @param mat Matrix to display (row-major)
     */
    public static void printMat(Double[][] mat) {
        for (Double[] row : mat) {
            System.out.print("[ ");
            for (Double val : row) {
                System.out.print(val + " ");
            }
            System.out.println("]");
        }
    }
    
    public static void main(String[] args) {
        // Exemple 1
        Double[][] matA1 = {
            {2.0, 3.0},
            {4.0, 5.0}
        };
        
        Double[][] matB1 = {
            {6.0, 7.0},
            {8.0, 9.0}
        };
        
        Double[][] result1 = multiply(matA1, matB1);
        printMat(result1); // Résultat attendu: [[36, 41], [64, 73]]

        // Exemple 2
        Double[][] matA2 = {
            {1.0, 0.0},
            {3.0, 2.0}
        };
        
        Double[][] matB2 = {
            {8.0, 6.0, 2.0},
            {4.0, 1.0, 0.0}
        };
        
        Double[][] result2 = multiply(matA2, matB2);
        printMat(result2); // Résultat attendu: [[8, 6, 2], [32, 20, 6]]

        // Exemple 3
        Double[][] matA3 = {
            {5.0, 6.0, 7.0}
        };
        
        Double[][] matB3 = {
            {1.0, 0.0},
            {0.0, 1.0},
            {1.0, 1.0}
        };
        
        Double[][] result3 = multiply(matA3, matB3);
        printMat(result3); // Résultat attendu: [[12, 13]]
    }
    
}
  
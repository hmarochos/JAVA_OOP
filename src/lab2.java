public class lab2 {
        public static void main(String[] args) {
                double[][] matrix_A =
                        {       {1,2,3},
                                {2,5,6},
                                {3,8,9}
                        };

                double[][] matrix_B =
                        {       {9,8,7},
                                {2,5,6},
                                {3,8,9}
                        };


                int m = matrix_A.length;
                int n = matrix_B[0].length;
                int o = matrix_B.length;
                int[][] res = new int[m][n];

                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        for (int k = 0; k < o; k++) {
                            res[i][j] += matrix_A[i][k] * matrix_B[k][j];
                        }
                    }
                }

                for (int i = 0; i < res.length; i++) {
                    for (int j = 0; j < res[0].length; j++) {
                        System.out.format("%2d ", res[i][j]);
                    }
                    System.out.println();
                }
            }
        }



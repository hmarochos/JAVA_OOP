public class lab_2 {
        public static void main(String[] args) {
            int[][] matrix =
                    {       {22, 42, 46},
                            {46, 89, 98},
                            {70, 136, 150}
                    };

            int sum1 = 0;
            int sum2 = 0;
            int sum3 = 0;

            for (int i = 0; i < 3; i++){

                sum1 += matrix[i][0];
                sum2 += matrix[i][1];
                sum3 += matrix[i][2];


                if (i==2){
                    int res1 = sum1/3;
                    System.out.println(res1);
                }
                if (i==2){
                    int res2 = sum2/3;
                    System.out.println(res2);
                }
                if (i==2){
                    int res3 = sum3/3;
                    System.out.println(res3);
                }

            }
        }
}




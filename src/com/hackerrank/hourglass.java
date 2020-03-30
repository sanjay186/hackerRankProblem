package com.hackerrank;

public class hourglass {

// Java program to find maximum
// sum of hour glass in matrix

    static int R = 6;
    static int C = 6;

    // Returns maximum sum of
// hour glass in ar[][]
    static int findMaxSum(int [][]mat)
    {
        if (R < 3 || C < 3)
            return -1;

        // Here loop runs (R-2)*(C-2)
        // times considering different
        // top left cells of hour glasses.
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < R - 2; i++)
        {
            for (int j = 0; j < C - 2; j++)
            {
                System.out.println(""+mat[i][j] + ""+ mat[i][j + 1]+""+mat[i][j + 2]);
                System.out.println(" "+mat[i + 1][j + 1]+" ");
                System.out.println(""+mat[i + 2][j] +""+ mat[i + 2][j + 1]+""+ mat[i + 2][j + 2]);

                System.out.println("   ");
                // Considering mat[i][j] as top
                // left cell of hour glass.
                int sum = (mat[i][j] + mat[i][j + 1] +
                        mat[i][j + 2]) + (mat[i + 1][j + 1]) +
                        (mat[i + 2][j] + mat[i + 2][j + 1] +
                                mat[i + 2][j + 2]);

                // If previous sum is less then
                // current sum then update
                // new sum in max_sum
                max_sum = Math.max(max_sum, sum);
            }
        }
        return max_sum;
    }
//    1 1 1 0 0 0
//            0 1 0 0 0 0
//            1 1 1 0 0 0
//            0 0 2 4 4 0
//            0 0 0 2 0 0
//            0 0 1 2 4 0

    // Driver code
    static public void main (String[] args)
    {
//        int [][]mat ={{1, 2, 3, 0, 0},
//                {0, 0, 0, 0, 0},
//                {2, 1, 4, 0, 0},
//                {0, 0, 0, 0, 0},
//                {1, 1, 0, 1, 0}};
        int [][]mat ={{1 ,1 ,1, 0, 0, 0},
                {0 ,1, 0, 0 ,0 ,0},
                { 1, 1 ,1 ,0, 0, 0},
                {0 ,0 ,2, 4, 4, 0},
                { 0 ,0 ,0 ,2, 0, 0},{  0 ,0 ,1 ,2 ,4 ,0}
        };
        int res = findMaxSum(mat);
        if (res == -1)
            System.out.println("Not possible");
        else
            System.out.println("Maximum sum of hour glass = "
                    + res);
    }

}
//        1 1 1   1 1 0   1 0 0   0 0 0
//        1       0       0       0
//        1 1 1   1 1 0   1 0 0   0 0 0
//
//        0 1 0   1 0 0   0 0 0   0 0 0
//        1       1       0       0
//        0 0 2   0 2 4   2 4 4   4 4 0
//
//        1 1 1   1 1 0   1 0 0   0 0 0
//        0       2       4       4
//        0 0 0   0 0 2   0 2 0   2 0 0
//
//        0 0 2   0 2 4   2 4 4   4 4 0
//        0       0       2       0
//        0 0 1   0 1 2   1 2 4   2 4 0


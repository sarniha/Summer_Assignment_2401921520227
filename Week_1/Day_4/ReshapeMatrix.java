class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        // reshape not possible
        if (m * n != r * c) {
            return mat;
        }

        int[][] result = new int[r][c];

        int row = 0;
        int col = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                result[i][j] = mat[row][col++];

                // move to next row in original matrix
                if (col == n) {
                    row++;
                    col = 0;
                }
            }
        }

        return result;
    }
}
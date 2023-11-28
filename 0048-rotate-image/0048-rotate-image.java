class Solution {
    public void rotate(int[][] matrix) {
        //convert it to transpose matrix -> Converting row into column and column into row except diagonal
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                if (i == j)
                    continue;
                int element = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = element;
            }
        }
        //inverse each row
        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix[i].length - 1;
            while (start <= end) {
                int element = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = element;
                start++;
                end--;
            }
        }
    }
}
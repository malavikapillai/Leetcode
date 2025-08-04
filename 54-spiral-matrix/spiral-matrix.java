class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int n = matrix.length;       // number of rows
        int m = matrix[0].length;    // number of columns

        int srow = 0, scol = 0;
        int erow = n - 1, ecol = m - 1;

        while (srow <= erow && scol <= ecol) {
            // top row
            for (int j = scol; j <= ecol; j++) {
                ans.add(matrix[srow][j]);
            }

            // right column
            for (int i = srow + 1; i <= erow; i++) {
                ans.add(matrix[i][ecol]);
            }

            // bottom row (only if not same as top)
            if (srow != erow) {
                for (int j = ecol - 1; j >= scol; j--) {
                    ans.add(matrix[erow][j]);
                }
            }

            // left column (only if not same as right)
            if (scol != ecol) {
                for (int i = erow - 1; i >=srow+1; i--) {
                    ans.add(matrix[i][scol]);
                }
            }

            srow++;
            erow--;
            scol++;
            ecol--;
        }

        return ans;
    }
}

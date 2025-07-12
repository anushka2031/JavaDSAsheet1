public class MaxSizeRectangle {

// Java program to find the maximum area of 
// rectangle in a 2D matrix.
    static int maxArea(int[][] mat) {
        int n = mat.length, m = mat[0].length;

        // 2D matrix to store the width of 1's 
        // ending at each cell.
        int[][] memo = new int[n][m];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) continue;

                // Set width of 1's at (i,j).
                if (j == 0) memo[i][j] = 1;
                else memo[i][j] = 1 + memo[i][j - 1];

                int width = memo[i][j];

                // Traverse row by row, update the 
                // minimum width and calculate area.
                for (int k = i; k >= 0; k--) {
                    width = Math.min(width, memo[k][j]);
                    int area = width * (i - k + 1);

                    ans = Math.max(ans, area);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {0, 1, 1, 0},
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 0, 0}
        };

        System.out.println(" The maximum size rectangle matrix area is " + maxArea(mat));
    }  
      
}

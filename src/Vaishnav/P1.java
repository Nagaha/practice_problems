package Vaishnav;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        int max = findMaxQr(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}});
        System.out.println(max); // Expected output should be 15
    }

    private static int findMaxQr(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        // Initialize dp array
        int[][] dp = new int[n][m];
        dp[0][0] = grid[0][0];

        // Fill the first row
        for (int j = 1; j < m; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }

        // Fill the first column
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        // Fill the rest of the dp array
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }

        // Store the maximum value
        int maxQR = dp[n - 1][m - 1];

        // Consider doubling each cell
        int maxQRWithDoubling = maxQR;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // Calculate the potential new value if this cell were doubled
                int doubleCellValue = grid[i][j] * 2;

                // Calculate the new dp values if we doubled this cell
                int[][] newDp = new int[n][m];
                newDp[0][0] = (i == 0 && j == 0) ? doubleCellValue : grid[0][0];

                // Fill the first row
                for (int col = 1; col < m; col++) {
                    if (i == 0 && col == j) {
                        newDp[0][col] = newDp[0][col - 1] + doubleCellValue;
                    } else {
                        newDp[0][col] = newDp[0][col - 1] + grid[0][col];
                    }
                }

                // Fill the first column
                for (int row = 1; row < n; row++) {
                    if (row == i && j == 0) {
                        newDp[row][0] = newDp[row - 1][0] + doubleCellValue;
                    } else {
                        newDp[row][0] = newDp[row - 1][0] + grid[row][0];
                    }
                }

                // Fill the rest of the newDp array
                for (int row = 1; row < n; row++) {
                    for (int col = 1; col < m; col++) {
                        if (row == i && col == j) {
                            newDp[row][col] = Math.max(newDp[row - 1][col], newDp[row][col - 1]) + doubleCellValue;
                        } else {
                            newDp[row][col] = Math.max(newDp[row - 1][col], newDp[row][col - 1]) + grid[row][col];
                        }
                    }
                }

                // Update the maximum QR value considering the current doubled cell
                maxQRWithDoubling = Math.max(maxQRWithDoubling, newDp[n - 1][m - 1]);
            }
        }

        return maxQRWithDoubling;
    }
}

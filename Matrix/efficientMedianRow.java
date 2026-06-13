import java.util.*;

class efficientMedianRow {
    public int median(int[][] mat) {

        int R = mat.length;
        int C = mat[0].length;

        int min = mat[0][0], max = mat[0][C - 1];

        // Find global min & max
        for (int i = 1; i < R; i++) {
            if (mat[i][0] < min) {
                min = mat[i][0];
            }
            if (mat[i][C - 1] > max) {
                max = mat[i][C - 1]; // ✅ fixed
            }
        }

        int medPos = (R * C + 1) / 2;

        while (min < max) {
            int mid = min + (max - min) / 2;

            int midPos = 0;

            // Count elements <= mid
            for (int i = 0; i < R; i++) {
                midPos += upperBound(mat[i], mid);
            }

            if (midPos < medPos) {
                min = mid + 1; // ✅ correct
            } else {
                max = mid;
            }
        }

        return min;
    }

    // Upper bound (count of elements <= target)
    private int upperBound(int[] row, int target) {
        int low = 0, high = row.length;

        while (low < high) {
            int mid = (low + high) / 2;
            if (row[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}
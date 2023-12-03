class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;

        for (int k = 1; k < points.length; k++) {
            int xDiff = Math.abs(points[k][0] - points[k - 1][0]);
            int yDiff = Math.abs(points[k][1] - points[k - 1][1]);
            ans += Math.max(xDiff, yDiff);
        }

        return ans;
    }
}

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // Find max of array
        int maxPile = 0;
        for (int pile : piles) {
            maxPile = Math.max(maxPile, pile);
        }

        int left = 1;
        int right = maxPile;
        int minRate = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            int copyTime = h;

            for (int i = 0; i < piles.length; i++) {
                int pileTime = (int) Math.ceil((double) piles[i] / mid);
                copyTime -= pileTime;
            }

            if (copyTime < 0) {
                // mid is too small; eating takes too long
                left = mid + 1;
            } else {
                // mid works, but try to find a smaller valid rate
                minRate = mid;
                right = mid - 1;
            }
        }

        return minRate;
    }
}
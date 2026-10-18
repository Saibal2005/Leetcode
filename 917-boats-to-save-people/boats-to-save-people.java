class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int[] count = new int[limit + 1];
        for (int p : people) {
            count[p]++;
        }

        int l = 1;
        int r = limit;
        int boats = 0;

        while (l <= r) {
            while (l <= r && count[l] <= 0) {
                l++;
            }
            while (l <= r && count[r] <= 0) {
                r--;
            }

            if (l > r) {
                break;
            }

            if (l + r <= limit) {
                count[l]--;
            }
            count[r]--;
            boats++;
        }

        return boats;
    }
}
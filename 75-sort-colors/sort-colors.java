class Solution {
    public void sortColors(int[] nums) {
        int c0 = 0, c1 = 0, c2 = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) c0++;
            else if (nums[i] == 1) c1++;
            else if (nums[i] == 2) c2++;
        }

        for (int i = 0; i < n; i++) {
            if (i < c0) {
                nums[i] = 0;
            } else if (i < c0 + c1) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
    }
}
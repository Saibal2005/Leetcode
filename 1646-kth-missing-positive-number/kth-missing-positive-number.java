class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int i = 0;
        int curr = 1;
        
        while (count < k) {
            if (i < arr.length && arr[i] == curr) {
                i++;
            } else {
                count++;
                if (count == k) {
                    return curr;
                }
            }
            curr++;
        }
        return curr - 1;
    }
}   
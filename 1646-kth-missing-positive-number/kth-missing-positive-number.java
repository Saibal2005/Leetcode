class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int i = 1;
        int index = 0;
        while (count < k) {
            if (index <arr.length && arr[index]==i)
            {
                index++;
            } 
            else 
            {
                count++;
                if (count == k)
                    return i;
            }
            i++;
        }

        return -1;
    }
}
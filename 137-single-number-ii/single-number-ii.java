class Solution {
    public int singleNumber(int[] nums) {
    int i=0,j=0;
    for (i=0;i<nums.length;i++)
    {
        if ((nums[j]==nums[i])&&(i!=j))
        {
            j=j+1;
            i=0;
        }
    }
    return nums[j];
            
    }
}
class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int k=n;
        int c=0;
        int[] nums1 = nums.clone();
        for(int i=0;i<n;i++)
        {
            if(nums1[i]==val)
            k--;
            else
            {nums[c]=nums1[i];
            c++;}
        }
        return k;
        
    }
}
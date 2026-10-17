class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int g=0;
        int [] ans=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                if(nums[i]>nums[j])
                {
                    g=g+1;
                }
            }
            ans[i]=g;
            g=0;
        }
        return ans;
        
    }
}
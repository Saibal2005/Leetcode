class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int left=0;
        int [] newnums=new int [n];
        int right= n-1;
        int c=0;
        while(left<=right)
        {
            if((Math.abs(nums[left]))>(Math.abs(nums[right])))
            {
                newnums[n-1-c]=nums[left]*nums[left];
                left++;
                c++;
            }
            else
            {
                newnums[n-1-c]=nums[right]*nums[right];
                right--;
                c++;
            }
            
        }
        return newnums;

        
    }
}
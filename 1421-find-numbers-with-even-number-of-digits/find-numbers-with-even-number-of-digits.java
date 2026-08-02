class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int k=0;
        int g=0;
        int c=0;
        for(int i=0;i<n;i++)
        {
            k=nums[i];
            while(k!=0)
            {
                k=k/10;
                g++;
            }
            if(g%2==0){
                c++;
            }
            g=0;
            
        }
        return c;
        
    }
}
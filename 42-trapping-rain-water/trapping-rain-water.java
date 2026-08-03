class Solution {
    public int trap(int[] height) {
        int [] lmax=new int[height.length];
        int [] rmax=new int[height.length];
        int k=0,l=0;
        int sum=0;
        for(int i=0;i<height.length;i++)
        {
            if(height[i]>k)
            {
                lmax[i]=height[i];
                k=height[i];
            }
            else
            {
                lmax[i]=k;
            }
        }
        for(int i=height.length-1;i>=0;i--)
        {
            if(height[i]>l)
            {
                rmax[i]=height[i];
                l=height[i];
            }
            else
            {
                rmax[i]=l;
            }
            
        }
        for(int i=0;i<height.length;i++)
        {
                if(lmax[i]>rmax[i])
                {
                    sum=sum+rmax[i]-height[i];
                }
                else
                {
                    sum=sum+lmax[i]-height[i];
                }
        }
        return sum;
    }
}
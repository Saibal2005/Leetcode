class Solution {
    public double average(int[] salary) {
        int n=salary.length;
        float h=salary[0];
        float l=salary[0];
        float sum =0;
        for(int i=0;i<n;i++)
        {
            sum=sum+salary[i];
            if(h>salary[i]){
                h=salary[i];
            }
            if(l<salary[i]){
                l=salary[i];
            }

        }
        sum=sum-h-l;
        return (double) sum / (n - 2);
        
    }
}
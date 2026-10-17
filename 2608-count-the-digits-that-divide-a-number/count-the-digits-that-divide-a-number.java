class Solution {
    public int countDigits(int num) {
        int n=num;
        int r;
        int c=0;
        while(n>0)
        {
            r=n%10;
            if(num%r==0)
            {
                c=c+1;
            }
            n=n/10;
        }
        return c;
        
    }
}
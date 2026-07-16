class Solution {
    public boolean isPalindrome(int x) {
        int k;
        int r=0;
        int x1=x;
        while(x>0)
        {
            k=x%10;
            r=r*10+k;
            x=x/10;
        }
        if(x1==r)
        return true;
        else 
        return false;
        
    }
}
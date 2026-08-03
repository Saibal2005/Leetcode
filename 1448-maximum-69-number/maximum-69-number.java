class Solution {
    public int maximum69Number(int num) {
        int n = num;
        int r;
        int c = 0;
        int k = -1;

        while (n != 0) {
            r = n % 10;
            if (r == 6)
                k = c;
            c++;
            n /= 10;
        }

        if (k == -1)
            return num;

        int x = (int) Math.pow(10, k);
        num += 3 * x;

        return num;
    }
}
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int t = numBottles;
        int e = numBottles;

        while (e >= numExchange) {
            int newBottles=e/numExchange;
            t += newBottles;
            e =newBottles+(e%numExchange);
        }

        return t;
    }
}
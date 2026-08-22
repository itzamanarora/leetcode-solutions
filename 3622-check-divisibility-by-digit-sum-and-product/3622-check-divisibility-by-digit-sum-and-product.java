class Solution {
    public boolean checkDivisibility(int n) {
       int duplicate = n;
       int sum = 0;
       int product = 1;

       while(duplicate > 0) {
            int temp = duplicate % 10;
            sum += temp;
            product *= temp;
            duplicate /= 10;
       }

       return n % (sum + product) == 0;
    }
}
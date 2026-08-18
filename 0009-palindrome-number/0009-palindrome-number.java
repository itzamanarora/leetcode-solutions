class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        
        if(x != 0 && x%10 == 0) return false;

        int reversedNumb = 0;
        while(x > reversedNumb) {
            reversedNumb = reversedNumb * 10 + x%10;
            x /= 10;
        }
        return x == reversedNumb || x == reversedNumb/10;
    }
}
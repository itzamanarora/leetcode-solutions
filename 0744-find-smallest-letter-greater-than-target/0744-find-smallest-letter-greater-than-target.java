class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        int middle;
        char ans = letters[0];

        while(start <= end) {
            middle = start + (end - start) / 2;

            if(letters[middle] > target) {
                ans = letters[middle];
                end = middle - 1;
            } else {
                start = middle + 1;
            }
            
        }
        return ans;
    }
}
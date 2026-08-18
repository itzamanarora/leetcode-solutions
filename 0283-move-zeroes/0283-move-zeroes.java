class Solution {
    public void moveZeroes(int[] nums) {
        int start = 0;
        int loop = 0;

        while(loop < nums.length) {
            if(nums[loop] == 0) {
                loop++;
            } else {
                int temp = nums[start];
                nums[start] = nums[loop];
                nums[loop] = temp;
                start++;
                loop++;
            }
        }
    }
}
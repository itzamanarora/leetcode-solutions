class Solution {
    public int search(int[] nums, int target) {
        int startPointer = 0;
        int endPointer = nums.length-1;

        while(startPointer <= endPointer) {

            int mid = startPointer + (endPointer - startPointer) / 2;

            if(nums[mid] == target) return mid;
            if(nums[mid] < target) startPointer = mid+1;
            else endPointer = mid-1;
        } 
        return -1;
    }
}
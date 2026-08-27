class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1,-1};
        arr[0] = search(nums, target, true);
        if(arr[0] != -1) {
            arr[1] = search(nums, target, false);
        }
        return arr;
    }

    private static int search(int[] nums, int target, boolean startIndex) {
        int start = 0;
        int end = nums.length-1;
        int middle;
        int ans = -1;

        while(start <= end) {
            middle = start + (end - start) / 2;

            if(nums[middle] < target) start = middle + 1;
            else if(nums[middle] > target) end = middle -1;
            else {
                if(startIndex) {
                    ans = middle;
                    end = middle -1;
                } else {
                    ans = middle;
                    start = middle + 1;
                }
            }
        }
        return ans;
    }

}
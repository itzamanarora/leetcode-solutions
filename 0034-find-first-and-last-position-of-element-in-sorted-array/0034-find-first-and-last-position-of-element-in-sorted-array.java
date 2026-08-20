class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[] {first, last};
    }

    private static int findFirst(int[]nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int first = -1;

        while(start <= end) {
            int middle = start + (end - start) / 2;

            if(nums[middle] == target) {
                first = middle;
                end = middle-1;
            }
            else if(nums[middle] < target) start = middle + 1;
            else end = middle - 1;
        }
        return first;
    }

    private static int findLast(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int last = -1;

        while(start <= end) {
            int middle = start + (end - start) / 2;

            if(nums[middle] == target) {
                last = middle;
                start = middle + 1;
            }
            else if(nums[middle] < target) start = middle + 1;
            else end = middle - 1;
        }

        return last;
    }
}
class Solution {
    public int[] sortArray(int[] nums) {
        divide(nums, 0, nums.length-1);
        return nums;
    }

    private static void divide(int[] nums, int startIndex, int endIndex) {
        if(startIndex >= endIndex) return;

        int midIndex = startIndex + (endIndex - startIndex)/2;

        divide(nums, startIndex, midIndex);
        divide(nums, midIndex+1, endIndex);
        conquer(nums, startIndex, midIndex, endIndex);
    }

    private static void conquer(int[] nums, int startIndex, int midIndex, int endIndex) {
        int[] mergedArray = new int[endIndex - startIndex + 1];

        int idx1 = startIndex;
        int idx2 = midIndex+1;
        int x = 0;

        while(idx1 <= midIndex && idx2 <= endIndex) {
             if (nums[idx1] <= nums[idx2]) {
                 mergedArray[x++] = nums[idx1++];
             } else {
                 mergedArray[x++] = nums[idx2++];
             }
        }

        while(idx1 <= midIndex) {
            mergedArray[x++] = nums[idx1++];
        }

        while(idx2 <= endIndex) {
            mergedArray[x++] = nums[idx2++];
        }
        for (int i = 0, j=startIndex; i < mergedArray.length; i++, j++) {
            nums[j] = mergedArray[i];
        }
    }
}
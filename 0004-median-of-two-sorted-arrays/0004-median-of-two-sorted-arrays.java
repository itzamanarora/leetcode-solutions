class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        int idx1 = 0;
        int idx2 = 0;
        int x = 0;

        while(idx1 <= nums1.length-1 && idx2 <= nums2.length-1) {
            if(nums1[idx1] <= nums2[idx2]) {
                mergedArray[x++] = nums1[idx1++];
            } else {
                mergedArray[x++] = nums2[idx2++];
            }
        }

        while(idx1 <= nums1.length-1) {
            mergedArray[x++] = nums1[idx1++];
        }
        while(idx2 <= nums2.length-1) {
            mergedArray[x++] = nums2[idx2++];
        }

        if(mergedArray.length % 2 != 0) {
            return mergedArray[mergedArray.length/2];
        } else {
            return (double) (mergedArray[mergedArray.length/2]+ mergedArray[(mergedArray.length/2)-1] ) / 2;
        }
    }
}
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        while(start < end) {
            int middle = start + (end - start) / 2;

            if(mountainArr.get(middle) < mountainArr.get(middle + 1)) start = middle + 1;
            else end = middle;
        }

        int result = binarySearch(mountainArr, 0, end, target, true);
        if(result != -1) return result;
        else {
            result = binarySearch(mountainArr, start, mountainArr.length()-1 , target, false);
            if(result != -1) return result;
        }
        return -1;
    }

    public int binarySearch(MountainArray mountainArr, int start, int end, int target, boolean isAsc) { 
        while(start <= end) {
            int middle = start + (end - start) / 2;

            if(mountainArr.get(middle) == target) return middle;
            else if(isAsc) {

                if(mountainArr.get(middle) < target) start = middle + 1;
                else end = middle - 1;

            } else {

                if(mountainArr.get(middle) < target) end = middle - 1;
                else start = middle + 1;

            }
        }

        return -1;
    }
}
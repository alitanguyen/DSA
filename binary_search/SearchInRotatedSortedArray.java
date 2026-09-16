// neetcode 150 medium 
// technique: binary search 

package binary_search;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == nums[left]) {
                return left;
            } 

            else if (target == nums[right]) {
                return right;
            }

            else if (target < nums[left] && target < nums[right]) {
                left = mid + 1;

            } else if (target > nums[left]) {
                right = mid - 1;
            }


        }
}

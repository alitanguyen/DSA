// EASY
// Return the first number that appears twice
// Example: [1, 2, 3, 2, 4] → 2

package arrays_and_hashing;

import java.util.HashSet;

public class FirstDuplicate {
    public int returnFirstDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1;                  // missed this line at first 
    }

public static void main(String[] args) {
    FirstDuplicate test = new FirstDuplicate();
    
    int[] nums = {1, 2, 3, 2, 4, 4};
    System.out.println(test.returnFirstDuplicate(nums));

    int[] nums2 = { 1, 2};
    System.out.println(test.returnFirstDuplicate(nums2));
}  
}

// EASY (Neetcode 150)
package arrays_and_hashing;
import java.util.HashSet;

    class ContainsDuplicate {
        public boolean hasDuplicate(int[] nums) {
            // create a HashSet that store Integer values 
            HashSet<Integer> seen = new HashSet<>();
                        // new HashSet<>() creates a new, empty HashSet
            for (int num : nums) {
                if (seen.contains(num)) {
                    return true;
                }
                seen.add(num);
            }
            return false;
        }


public static void main(String[] args) {
    containsDuplicate test = new containsDuplicate();
    int[] nums1 = {1, 2, 3, 1};     // true

    System.out.println(test.hasDuplicate(nums1));

    int[] nums2 = {1, 2, 3, 4};     // fasle

    System.out.println(test.hasDuplicate(nums2));

    int[] nums3 = {1, 1};           // true

    System.out.println(test.hasDuplicate(nums3));

}
    }

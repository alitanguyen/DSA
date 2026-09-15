// EASY
// Return each duplicate number
// Example: [1, 2, 3, 2, 4, 4, 4] → [2, 4, 4]

package ArraysAndHashing;
import java.util.ArrayList;
import java.util.HashSet;

public class allDuplicate{
    public ArrayList<Integer> returnAllDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                result.add(num);
            } else {
                seen.add(num);
            }
            }
            return result;
        }

public static void main(String[] args) {
    allDuplicate test = new allDuplicate();
    
    int[] nums = {1, 2, 3, 2, 4, 4, 4};
    System.out.println(test.returnAllDuplicate(nums));   // output: [2, 4, 4]

    int[] nums2 = { 1, 2};
    System.out.println(test.returnAllDuplicate(nums2));  // output: []
}  
}

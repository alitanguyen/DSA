// EASY
// Return each duplicate number only once
// Example: [1, 2, 3, 2, 4, 4, 4] → [2, 4]

package ArraysAndHashing;
import java.util.HashSet;

public class allDuplicateOnce {
    public HashSet<Integer> returnAllDuplicateOnce(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> resultUniqueSet = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                resultUniqueSet.add(num);
            } else {
                seen.add(num);
            }
        }
        return resultUniqueSet;
    } 

    public static void main(String[] args) {
    allDuplicateOnce test = new allDuplicateOnce();
    
    int[] nums = {1, 2, 3, 2, 4, 4, 4};
    System.out.println(test.returnAllDuplicateOnce(nums));   // output: [2, 4]

    int[] nums2 = { 1, 2};
    System.out.println(test.returnAllDuplicateOnce(nums2));  // output: []
}  
}


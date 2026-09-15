// MEDIUM
// Return all numbers sorted from most frequent to least frequent.
// Example: nums = [4, 4, 1, 1, 1, 2]
// Output: [1, 4, 2]

package arrays_and_hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class SortByFrequency {
    public int[] sortNumbersByFrequency (int[] nums) {
        // count the frequencies 
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num,hm.getOrDefault(num, 0) + 1);
        }
        // store the keys 
        ArrayList<Integer> numbers = new ArrayList<>(hm.keySet());

        // sort the keys based on the values (frequencies), highest values first 
        numbers.sort((a, b) -> hm.get(b) - hm.get(a));

        // return the sorted keys
        int s = numbers.size();
        int[] result = new int[s];
        for (int i = 0; i < s; i++) {
            result[i] = numbers.get(i);
        }
        
        return result;

    }
public static void main(String[] args) {
        sortByFrequency test = new sortByFrequency();
        int[] nums = {4, 4, 1, 1, 1, 2};
        System.out.println(
            java.util.Arrays.toString(
                test.sortNumbersByFrequency(nums)                // Output: [1, 4, 2]
            )
        );
    }
}



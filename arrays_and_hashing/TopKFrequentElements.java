// MEDIUM (Neetcode 150)
// Input: nums = [1,2,2,3,3,3], k = 2
// Output: [2,3]

package arrays_and_hashing;
import java.util.ArrayList;
import java.util.HashMap;

public class TopKFrequentElements {
        public int[] returnTopKFrequent(int[] nums, int k) {
        
        // count # times each number appears (frequencies)
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        // get all numbers
        ArrayList<Integer> numbers = new ArrayList<>(hm.keySet());

        // sort numbers by frequencies, highest first 
        numbers.sort((a, b) -> hm.get(b) - hm.get(a));

        // take top k
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = numbers.get(i);                 // get the element at index i in ArrayList
        }
        return result;

        }
    public static void main(String[] args) {
        TopKFrequentElements test = new TopKFrequentElements();
        int[] nums = {1, 2, 2, 3, 3, 3};
        int k = 2;
        System.out.println(
            java.util.Arrays.toString(
                test.returnTopKFrequent(nums, k)                // Output: [3, 2]
            )
        );
    }
}


// What to remember: 
// hm.getOrDefault(num, 0):
// give me the VALUE stored for num
// If num doesn't exist, give me 0 

// Then + 1s:
// get the current count, then increase it by 1

// hm.put():
// store this VALUE, using NUM as the KEY => hm.put(num, newCount)

/// Pattern Recognition: 
/// Count how many times x appears: Put the number, get its old count, add one
// hm.put(x, hm.getOrDefault(x, 0) + 1);

// .keySet() => gives you all the keys
// .get(key) => gives you the value for one key
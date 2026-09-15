// Return all numbers that appear at least k times.
// Example: nums = [1, 2, 2, 3, 3, 3, 4, 4, 4], k = 2
// Output: [2, 3, 4]

package arrays_and_hashing;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindNumberAppearsAtLeastKTimes {

    // Option 1: 
    // public int[] findNumberAppearTimes(int[] nums, int k) {

    //     // count frequencies 
    //     Map<Integer, Integer> freq = new HashMap<>();

    //     for (int num : nums) {
    //         freq.put(num, freq.getOrDefault(num, 0) + 1);
    //     }

    //     // find numbers appearing at least k times
    //     ArrayList<Integer> resultList = new ArrayList<>();
    //     for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
    //         if (entry.getValue() >= k) {
    //             resultList.add(entry.getKey());
    //         }
    //     }

    //     // convert ArrayList<Integer> to int[]
    //     int[] result = new int[resultList.size()];
    //     for (int i = 0; i < resultList.size(); i++) {
    //         result[i] = resultList.get(i);
    //     }
    //     return result;
    // }

    // Option 2: 
    public int[] findNumberAppearTimes(int[] nums, int k) {
        if (k > nums.length) {
            return new int[0];
        }

        Map<Integer, Integer> freqMap = new HashMap<>();
        Set<Integer> result = new HashSet<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            if (freqMap.get(num) >= k) {
                result.add(num);
            }
        }

        // covert to primitive/native int[]
        return result.stream().mapToInt(Integer::intValue).toArray();

    }
    public int[] returnTopKFrequent(int[] nums, int k) {
        return findNumberAppearTimes(nums, k);
    }

    public static void main(String[] args) {
        FindNumberAppearsAtLeastKTimes test = new FindNumberAppearsAtLeastKTimes();
        int[] nums = {1, 2, 2, 3, 3, 3, 4, 4, 4};
        int k = 2;
        System.out.println(java.util.Arrays.toString(test.returnTopKFrequent(nums, k)));
    }
}

// What to remember: 
// Important pattern for hash map

// for (int key : hm.keySet()) {
//     int value = hm.get(key);
//     if (value >= k) {
//         // do something with key
//     }
// }
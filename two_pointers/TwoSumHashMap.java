// neetcode150 medium
// technique: hash map   
// below solution applies for both sorted and unsorted array

package two_pointers;

import java.util.HashMap;

public class TwoSumHashMap {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();
            for (int i = 0; i < numbers.length; i++) {
                int complement = target - numbers[i];

                if (seen.containsKey(complement)) {
                    return new int[] {seen.get(complement), i};
                }
                seen.put(numbers[i], i);


            }
            return new int[] {}; // no solution found 
    
}
public static void main(String[] args) {
    TwoSumHashMap test = new TwoSumHashMap();
    int[] result = test.twoSum(new int[]{2, 4, 1, 6}, 10);
    System.out.println(result[0] + ", " + result[1]);
    }
}



// neetcode150 medium
// technique: two pointers  
// below solution ONLY applies for a sorted array

package two_pointers;

public class TwoSumTwoPointers {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int [] result = new int[2];

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                result[0] = left + 1;
                result[1] = right + 1;
                return result;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
                
        }
        return result;
    }
    
    public static void main(String[] args) {
        TwoSumTwoPointers test = new TwoSumTwoPointers();
        int[] result = test.twoSum(new int[]{1, 2, 3, 4}, 3);
        System.out.println(result[0] + ", " + result[1]);
    }
}

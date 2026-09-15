// neetcode 150 medium 
// techniques: Sliding Window, HashSet (for unique characters in the window)
// right expands the window. left shrinks the window when the window becomes invalid.
// time complexity: O(n)

package two_pointers;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 0; 
        int max = 0;

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                max = Math.max(max, set.size());
                right++;

            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }

    
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingChars test = new LongestSubstringWithoutRepeatingChars();
        String s = "zyyzx";
        System.out.println(test.lengthOfLongestSubstring(s));

        }
    }
    

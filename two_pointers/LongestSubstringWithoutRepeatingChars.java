// neetcode 150 
// topic: sliding window 

package two_pointers;

public class LongestSubstringWithoutRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 1;
        int maxLength = 0;

        while (right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                maxLength = 1;
                break;
            }

            else {
                left = right;
                right = right + 1;
                int subStringLength = right;
                maxLength = Math.max(maxLength, subStringLength);
            }

            }

        return maxLength; 
    }

    
    public static void main(String[] args) {
    LongestSubstringWithoutRepeatingChars test = new LongestSubstringWithoutRepeatingChars();
    
    String s = "zyyzxyz";
    System.out.println(test.lengthOfLongestSubstring(s));

        }
    }
    

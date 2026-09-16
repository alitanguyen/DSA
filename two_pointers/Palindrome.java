package two_pointers;

public class Palindrome {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
        }
public static void main(String[] args) {
    Palindrome test = new Palindrome();
    boolean example = test.isPalindrome("raceca");
    System.out.println(example);

    }
}



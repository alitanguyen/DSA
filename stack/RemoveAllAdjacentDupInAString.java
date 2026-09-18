// algomaster easy
// technique: stack 

// abbaca -> ca 

package stack;


public class RemoveAllAdjacentDupInAString {
    public String removeDuplicates(String s) {

        // create an empty StringBuilder and calls it stack
        // think of it as an empty box where you can add/remove chars
        StringBuilder stack = new StringBuilder();

        // loop through each char 
        for (char c : s.toCharArray()) {
            // if top matches current character, pop the pair

            if (stack.length() == 0) {
                stack.append(c);
            } else {
                char top = stack.charAt(stack.length() - 1);

                if (top == c) {
                    stack.deleteCharAt(stack.length() - 1);
                } else {
                    stack.append(c);
                }
            }
        }
        return stack.toString();
}
}



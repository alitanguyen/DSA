//algomaster medium
// techniques: stack, StringBuilder
// leet**cod*e -> lecoe

package stack;

import java.util.Stack;

public class RemoveStarsFromAString {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
            
        for (int i = 0; i < s.length(); i++) {
                char cur = s.charAt(i);

                if (cur != '*') {
                    stack.push(cur);
                } else {
                stack.pop();
            }
        }

        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.reverse().toString();   
    }
}

// Self-note: 
// Without StringBuilder, the output = [l, e, c, o, e]
// No return stack in Java because the stack is a Stack<Character>, not a String.

// Why needs .toString()?
// Because reverse() returns a StringBuilder, not a String.

// Think of it like:
// StringBuilder = a container you can modify 
// String = the final text 

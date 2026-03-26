package DSA_Day3;

import java.util.*;

public class Ques6 {
    public static void main(String[] args) {
        String s = "([{}])";
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    System.out.println(false);
                    return;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(stack.isEmpty());
    }
}

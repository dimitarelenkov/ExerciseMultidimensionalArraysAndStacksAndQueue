package ExecriseStacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _5_BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Character> stack = new ArrayDeque<>();
        String expression = scanner.nextLine();

        for (char parenthesis : expression.toCharArray()) {

            if (parenthesis == '{' || parenthesis == '[' || parenthesis == '(') {
                stack.push(parenthesis);
            }
            else {

              if (stack.isEmpty() || !areMatchingParenthesis(stack.pop(), parenthesis)){
                  System.out.println("NO");
                  return;
              }
            }
        }
        System.out.println("YES");
    }

    private static boolean areMatchingParenthesis(char openParenthesis, char closeParenthesis) {
        if (openParenthesis == '{') {
            return  closeParenthesis == '}';
        }
        else if (openParenthesis == '[') {
            return closeParenthesis == ']';
        }
        else {
            return closeParenthesis == ')';
        }
    }
}

package lesson36.hw3;
import java.util.Stack;

public class BracketBalanceChecker {

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char bracket : input.toCharArray()) {
            if (isOpeningBracket(bracket)) {
                stack.push(bracket);
            } else if (isClosingBracket(bracket)) {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), bracket)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isOpeningBracket(char bracket) {
        return bracket == '(' || bracket == '[' || bracket == '{';
    }

    private static boolean isClosingBracket(char bracket) {
        return bracket == ')' || bracket == ']' || bracket == '}';
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '[' && closing == ']') ||
                (opening == '{' && closing == '}');
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{{()}"));
        System.out.println(isBalanced("[()]"));
        System.out.println(isBalanced("{[()]}"));
        System.out.println(isBalanced("([{{[(())]}}])"));
        System.out.println(isBalanced("{{[]()}}}}"));
        System.out.println(isBalanced("{[(])}"));
    }
}
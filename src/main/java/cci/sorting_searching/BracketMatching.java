package cci.sorting_searching;

import java.util.Scanner;
import java.util.Stack;

public class BracketMatching
{
    public static boolean isBalanced(String expression)
    {
        Stack<Character> stack = new Stack<>();

        for (Character exp : expression.toCharArray()) {
            if (exp == '{' || exp == '[' || exp == '(') {
                stack.push(exp);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                Character pop = stack.pop();
                if (exp == '}' && pop == '{') {
                } else if (exp == ')' && pop == '(') {
                } else if (exp == ']' && pop == '[') {
                } else {
                    return false;
                }
            }
        }

        if(!stack.isEmpty()){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}

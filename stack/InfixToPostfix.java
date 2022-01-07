
package stack;

import java.util.Stack;

public class InfixToPostfix {

  public static int getPrec(Character s) {
    if (s == '^') {
      return 2;
    } else if (s == '*' || s == '/') {
      return 1;
    } else if (s == '+' || s == '-') {
      return 0;
    } else {
      return -1;
    }
  }

  public static String getPostFix(String infix) {
    String res = "";
    Stack<Character> st = new Stack<Character>();
    for (int i = 0; i < infix.length(); i++) {
      if ((infix.charAt(i) >= 'A' && infix.charAt(i) <= 'Z') || ((infix.charAt(i) >= 'a' && infix.charAt(i) <= 'z'))
          || (infix.charAt(i) >= '0' && infix.charAt(i) <= '0')) {
        res = res + infix.charAt(i);
      } else if (infix.charAt(i) == '(') {
        st.push(infix.charAt(i));
      } else if (infix.charAt(i) == ')') {
        while (!st.isEmpty() && st.peek() != '(') {
          res = res + st.pop();
        }
        st.pop();
      } else {
        while (!st.isEmpty() && getPrec(infix.charAt(i)) <= getPrec(st.peek())) {
          res = res + st.pop();
        }
        st.push(infix.charAt(i));
      }
    }
    while (!st.empty()) {
      res = res + st.pop();
    }
    return res;
  }
  public static void main(String[] args){
    String s = "a+b*(c^d-e)^(f+g*h)-i";
    System.out.println(getPostFix(s));
  }
}



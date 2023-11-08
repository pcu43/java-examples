import java.util.*;
public class LC0001 {
  public static final char[] LETTERS = new char[] {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
  public static void main(String[] args) {
    System.out.println(toBase26(1));
    System.out.println(toBase26(2));
    System.out.println(toBase26(3));
    System.out.println(toBase26(26));
    System.out.println(toBase26(27));
    System.out.println(toBase26(28));
    System.out.println(toBase26(52));
    System.out.println(toBase26(701));
  }
  public static String toBase26(int n) {
    Stack<Integer> st = new Stack<>();
    while (n != 0) {
      n = n - 1;
      int q = n / 26;
      int r = n % 26;
      st.push(r);
      n = q;
    }
    String s = "";
    while (!st.empty()) {
      int i = st.pop();
      s += LETTERS[i];
    }
    return s;
  }
}

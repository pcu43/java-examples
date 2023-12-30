import java.util.*;
public class Test {
  public static final Map<Character, Integer> letters = new HashMap<>();
  static {
    letters.put('A', 1);
    letters.put('B', 2);
    letters.put('C', 3);
    letters.put('D', 4);
    letters.put('E', 5);
    letters.put('F', 6);
    letters.put('G', 7);
    letters.put('H', 8);
    letters.put('I', 9);
    letters.put('J', 10);
    letters.put('K', 11);
    letters.put('L', 12);
    letters.put('M', 13);
    letters.put('N', 14);
    letters.put('O', 15);
    letters.put('P', 16);
    letters.put('Q', 17);
    letters.put('R', 18);
    letters.put('S', 19);
    letters.put('T', 20);
    letters.put('U', 21);
    letters.put('V', 22);
    letters.put('W', 23);
    letters.put('X', 24);
    letters.put('Y', 25);
    letters.put('Z', 26);
  }
  public static void main(String[] args) {
    System.out.println(base26toInt("A"));
    System.out.println(base26toInt("AB"));
    System.out.println(base26toInt("ZY"));
  }
  public static int base26toInt(String s) {
    int sum = 0;
    for (int i = s.length() - 1; i >= 0; i--) {
      int base = ((s.length() - 1) - i) * 26;
      int val = letters.get(s.charAt(i));
      if (base > 0) {
        sum += (base * val);
      } else {
        sum += val;
      }
    }
    return sum;
  }
}

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class CW0001 {
  public static void main(String[] args) {
    int[] a = new int[]{1,1,2,3,3,4,4,5,5,5,5,6,6,7,7,7,7,8,8};
    int odd = findIt(a);
    System.out.println(odd);
  }
  public static int findIt(int[] a) {
    Map<Integer, Long> intCounts = Arrays.stream(a).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    for (Map.Entry<Integer, Long> entry : intCounts.entrySet()) {
      if (entry.getValue() % 2 != 0) {
        return entry.getKey();
      }
    }
    return -1;
  }
}

import java.util.Map;
import java.util.stream.Collectors;
import java.util.function.Function;

public class Demo0004 {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Usage: java Demo0003 <string>");
      System.exit(0);
    }
    String s = args[0];
    Map<Character,Long> charMap = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    charMap.forEach((k, v) -> System.out.printf("%s: %d\n", k, v));
  }
}

import java.util.stream.Collectors;
import java.util.*;

public class Demo0002 {
  public static void main(String[] args) {
    List<Integer> values = new ArrayList<>();
    values.add(2);
    values.add(4);
    values.add(6);
    values.add(8);
    System.out.println("Using default toString():");
    System.out.println(values);
    System.out.println("Using stream with Collectors.joining:");
    System.out.println(values.stream().map(Object::toString).collect(Collectors.joining(" ")));
  }
}

import java.util.regex.*;
public class CW0002 {
  public static void main(String[] args) {
    String s = args[0];
    Pattern pattern = Pattern.compile("[1-9]+");
    Matcher matcher = pattern.matcher(s);
    String[] tokens = s.split(" ");
    String[] a = new String[tokens.length];
    int ctr = 0;
    while (matcher.find()) {
      //System.out.println(matcher.group());
      //l.add(matcher.group());
      int i = Integer.parseInt(matcher.group());
      a[i-1] = tokens[ctr++];
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < a.length; i++) {
      sb.append(a[i]);
      sb.append(" ");
    }
    System.out.println(sb.toString());
    
  }
}

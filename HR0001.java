import java.util.regex.*;

public class HR0001 {
  public static void main(String[] args) {
    String s = args[0];
    System.out.println(s);
    String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
    Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
    Matcher m = p.matcher(s);
    while (m.find()) {
      s = s.replaceAll(m.group(), m.group(1));
    }
    System.out.println(s);
  }
}

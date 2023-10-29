public class Demo0003 {
  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("Usage: java Demo0003 <string> <char>");
      System.exit(0);
    }
    String s = args[0];
    char c = args[1].charAt(0);
    long i = s.chars().filter(ch -> ch == c).count();
    System.out.printf("There are %d occurences of the character '%s' in the string \"%s\"\n", i, c, s);
  }
}

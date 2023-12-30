class LC0002 {
  public static void main(String[] args) {
    LC0002 lc = new LC0002();
    System.out.println(lc.longestPalindrome(args[0]));
  }
  public String longestPalindrome(String s) {
    String longest = null;
    char[] arr = s.toCharArray();
    for (int i = 0; i < arr.length; i++) {
      String s1 = expand(arr, i, i);
      String s2 = expand(arr, i, i + 1);
      if (longest == null || s1.length() > longest.length()) {
        longest = s1;
      }
      if (s2.length() > longest.length()) {
        longest = s2;
      }
    }
    return longest;
  }
  private String expand(char[] arr, int from, int to) {
    while (from >= 0 && to < arr.length && arr[from] == arr[to]) {
      from--;
      to++;
    }
    return String.copyValueOf(arr, from + 1, (to - (from + 1)));
  }
}

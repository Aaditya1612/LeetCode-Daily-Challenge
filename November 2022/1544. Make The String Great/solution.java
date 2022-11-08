class Solution {
  public String makeGood(String s) {

    StringBuilder sb = new StringBuilder(s);
    int len = sb.length();
    if (s == "") {
      return s;
    }

    for (int i = 0; i < len - 1; i++) {
      char current = sb.charAt(i);
      char next = sb.charAt(i + 1);

      if (String.valueOf(current).equalsIgnoreCase(String.valueOf(next)) && next != current) {
        System.out.println(i);
        sb.deleteCharAt(i);
        sb.deleteCharAt(i);
        len = len - 2;
        i = -1;
      }

    }
    return sb.toString();
  }
}

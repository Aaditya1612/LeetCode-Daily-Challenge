class Solution {
  public int longestPalindrome(String[] words) {
    int len = 0;
    HashMap < String, Integer > map = new HashMap < > ();
    for (String s: words)
      map.put(s, 1 + map.getOrDefault(s, 0));

    boolean found = true;

    for (Map.Entry m: map.entrySet()) {
      String str = (String) m.getKey();
      String rev = String.valueOf(str.charAt(1)) + String.valueOf(str.charAt(0));

      if (str.charAt(1) != str.charAt(0) && map.containsKey(rev)) {
        if (map.get(str) > 0 && map.get(rev) > 0) {
          int min = Math.min(map.get(str), map.get(rev));
          map.put(str, map.getOrDefault(str, 0) - min);
          map.put(rev, map.getOrDefault(rev, 0) - min);
          len += 4 * min;
        }

      } else if (str.charAt(1) == str.charAt(0)) {
        len += (map.get(str) / 2) * 4;
        if (map.get(str) % 2 != 0 && found) {
          found = false;
          len += 2;
        }

      }
    }
    return len;
  }
}

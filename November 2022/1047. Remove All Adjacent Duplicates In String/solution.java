// Asked on 10-11-2022 (DD-MM-YYYY)
// Language: Java

class Solution {
  public String removeDuplicates(String s) {
    Stack < Character > stack = new Stack < > ();
    StringBuilder sb = new StringBuilder();
    char[] arr = s.toCharArray();
    for (char i: arr) {
      if (!stack.isEmpty() && stack.peek() == i) {
        stack.pop();
      } else {
        stack.push(i);
      }
    }

    for (char i: stack) {
      sb.append(i);
    }

    return sb.toString();
  }
}

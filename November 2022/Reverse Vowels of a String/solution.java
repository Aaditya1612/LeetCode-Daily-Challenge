// Asked on 04-11-2022 (DD-MM-YYYY)

class Solution {
  boolean isVowel(char c) {
    c = Character.toLowerCase(c);
    return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
  }

  public String reverseVowels(String s) {
    // `left` is the left pointer to track the vowel character
    // `right` is the right pointer to track the vowel character
    int n = s.length(), left = 0, right = n - 1;
    char[] array = s.toCharArray();
    while (left < right) {
      // find the index of the first vowel in the given range
      while (left < right && !isVowel(array[left])) {
        left++;
      }
      // find the index of last vowel in the given range
      while (right > left && !isVowel(array[right])) {
        right--;
      }

      // swap ca[l] and ca[r]
      {
        char temp = array[left];
        array[left] = array[right];
        array[right] = temp;
      }

      left += 1;
      right -= 1;
    }
    return new String(array);
  }
}

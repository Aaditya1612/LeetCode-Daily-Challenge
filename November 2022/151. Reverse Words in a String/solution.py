# Asked on: 13-11-2022 (DD-MM-YYYY)
# Language: Python

class Solution:
    def reverseWords(self, s: str) -> str:
        s=s.strip()
        original = s.split(" ")
        
        while ('' in original):
            original.remove('')
        
        original.reverse()
        return " ".join(original)
      
      

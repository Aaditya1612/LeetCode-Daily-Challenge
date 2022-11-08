# Asked on 08-11-2022 (DD-MM-YYYY)
# Solution in Python

class Solution:
    def makeGood(self, s: str) -> str:
        i = 0
        while i < len(s) - 1:
            if s[i] != s[i + 1] and (
                s[i] == s[i + 1].lower() or s[i] == s[i + 1].upper()
            ):
                s = s[0:i] + s[i + 2 :]
                i = 0
            else:
                i = i + 1
        return s
